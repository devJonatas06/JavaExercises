package STUDYJAVA.exercises.OopIntherence.objects;
import STUDYJAVA.exercises.OopIntherence.objects.Floor;
import STUDYJAVA.exercises.OopIntherence.objects.Carpet;



public class Calculator {
    private Floor floor;
    private Carpet carpet;


    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
