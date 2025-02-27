package STUDYJAVA.exercises.OopIntherence.objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (lastName.isEmpty()) {
            return firstName;

        } else if (firstName. isEmpty()) {
            return lastName;
        }
        return firstName + lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = (firstName == null) ? " " : firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
     this.lastName = (lastName == null) ? " ": lastName;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

}