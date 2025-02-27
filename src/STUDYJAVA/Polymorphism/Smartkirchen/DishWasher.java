package STUDYJAVA.Polymorphism.Smartkirchen;

public class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void dishWasher(){
        if (hasWorkToDo){
            System.out.println("washing the dishes");
            hasWorkToDo = false;
        }

    }
}
