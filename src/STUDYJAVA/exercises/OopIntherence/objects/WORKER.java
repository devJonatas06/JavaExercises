package STUDYJAVA.exercises.OopIntherence.objects;

public class WORKER {
    private String name;
    private String BirthDate;
    protected String EndDate;

    public WORKER() {

    }

    public WORKER(String name, String birthDate) {
        this.name = name;
        this.BirthDate = birthDate;
    }

    public  int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(BirthDate.substring(6));
        return (currentYear - birthYear);
    }
    public double collectPay(){
        return 0.0;

    }
    public void terminate(String endDate) {
        this.EndDate = endDate;
    }

    @Override
    public String toString() {
        return "WORKER{" +
                "name='" + name + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}