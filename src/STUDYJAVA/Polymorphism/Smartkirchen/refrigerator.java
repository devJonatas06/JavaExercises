package STUDYJAVA.Polymorphism.Smartkirchen;

public class refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("ordering food");
            hasWorkToDo = false;
        }

    }


}
