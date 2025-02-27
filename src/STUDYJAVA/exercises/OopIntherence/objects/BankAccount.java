package STUDYJAVA.exercises.OopIntherence.objects;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String AccountName;
    private String email;
    private String PhoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String accountName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        AccountName = accountName;
        this.email = email;
        PhoneNumber = phoneNumber;
    }

    public void depositingFound(double depositAmount){
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New Balance Is $  " + accountBalance);
    }
    public void withdrawingfunds(double withdrawing){
        if ( accountBalance - withdrawing < 0) {
            System.out.println("Insuffiecient Funds! you only have $ " + accountBalance +
                    " In your account.");

        }else{
            accountBalance -= withdrawing;
            System.out.println("Your withdrew " + withdrawing + " you new balance is  " + accountBalance +"$");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
