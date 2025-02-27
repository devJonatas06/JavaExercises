package STUDYJAVA.exercises.OopIntherence.objects;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;

    }
    public double getDivisionResult(){
        if (secondNumber == 0) {
            return 0;
        }
        return  firstNumber / secondNumber;
    }

    public double getFirstnumber() {
        return firstNumber;
    }

    public void setFirstnumber(double firstnumber) {
        this.firstNumber = firstnumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
