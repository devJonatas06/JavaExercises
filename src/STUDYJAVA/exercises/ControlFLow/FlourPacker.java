package STUDYJAVA.exercises.ControlFLow;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(4,3,20));
    }
    public static boolean validate(int number){
        return number >= 0;

    }
    public static boolean canPack(int BigCount, int SmallCount, int goal) {
        if (!validate(BigCount) || !validate(SmallCount) || !validate(goal)) {
            return false;
        }
        int MaxbigCountKg = Math.min(goal / 5, BigCount);
        int remainingGoal = goal - (MaxbigCountKg * 5);

        if(remainingGoal <= SmallCount){
            return true;
        }else{
            int addBigBags = (remainingGoal / 5);
            int addSmallBags = (remainingGoal % 5);
            System.out.println(" Meta nao alcancada. ");
            System.out.println("Faltam "+ addBigBags + " sacos Grandes e "+ addSmallBags + " Sacos pequenos");
            return false;
        }
    }
}