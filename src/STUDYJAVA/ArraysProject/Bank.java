package STUDYJAVA.ArraysProject;
import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        Bank bank = new Bank("Banco Central");

        bank.addBranch("Agência Centro");
        bank.addCustomer("Agência Centro", "Carlos", 500.0);
        bank.addCustomerTransaction("Agência Centro", "Carlos", 150.0);

        bank.addBranch("Agência Norte");
        bank.addCustomer("Agência Norte", "Ana", 300.0);
        bank.addCustomerTransaction("Agência Norte", "Ana", 100.0);

        System.out.println("Lista de Bancos e Clientes:");
        for (Branch branch : bank.branches) {
            System.out.println("\nAgência: " + branch.getName());
            if (branch.getCustomers().isEmpty()) {
                System.out.println("Nenhum cliente registrado.");
            }else{
                for (Customer customer : branch.getCustomers()) {
                    System.out.println(customer.getName() + " - Transações: " + customer.getTransactions());
                }
            }

        }
    }

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println(branchName + " já está na lista.");
            return false;
        }
        branches.add(new Branch(branchName));
        return true;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransactions);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    class Branch {
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public boolean newCustomer(String customerName, double initialTransactions) {
            if (findCustomer(customerName) != null) {
                return false;
            }
            customers.add(new Customer(customerName, initialTransactions));
            return true;
        }

        public boolean addCustomerTransaction(String customerName, double transaction) {
            Customer customer = findCustomer(customerName);
            if (customer != null) {
                customer.addTransaction(transaction);
                return true;
            }
            return false;
        }

        private Customer findCustomer(String customerName) {
            for (Customer customer : customers) {
                if (customer.getName().equalsIgnoreCase(customerName)) {
                    return customer;
                }
            }
            return null;
        }
    }

    class Customer {
        private String name;
        private ArrayList<Double> transactions;

        public Customer(String name, double initialTransactions) {
            this.name = name;
            this.transactions = new ArrayList<>();
            addTransaction(initialTransactions);
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }

        public void addTransaction(double transaction) {
            transactions.add(transaction);
        }
    }
}
