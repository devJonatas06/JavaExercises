package STUDYJAVA.exercises.OopIntherence.objects;

public class backaccount {
    public static void main(String[] args) {
        BankAccount jonatasAccount = new BankAccount(23452,2000, "jonatas",
                "jonatas","95205392" );
        jonatasAccount.depositingFound(300.0);
        jonatasAccount.withdrawingfunds(100.0);
    }
}
