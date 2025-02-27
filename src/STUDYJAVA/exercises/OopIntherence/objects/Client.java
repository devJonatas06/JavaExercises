package STUDYJAVA.exercises.OopIntherence.objects;


public class Client {
    public static void main(String[] args) {
        Client client = new Client();
     
    }
    private String name;
    private int creditLimit;
    private String email;

    public Client() {
        this("noboy",00000,"nobody@nowhere.com");

    }

    public Client(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Client(String name, String email) {

        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
