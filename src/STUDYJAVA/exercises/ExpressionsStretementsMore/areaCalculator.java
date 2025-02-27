package STUDYJAVA.exercises.ExpressionsStretementsMore;

public class areaCalculator {
    public static double area(double radius){
        if (radius < 0 )  {
            return  -1.0;
        }
        return 3.14 * radius * radius;
    }
    public static  double area(double XBase, double yAltura ){
        if (XBase  <  0  || yAltura < 0 ) {
            return -1.0;
        }
        return XBase * yAltura;
    }

    public static void main(String[] args) {
        System.out.println("Area do Circulo com Area: 4,0 =  " + area(4));
        System.out.println("Area do Circulo com Area: -2 = " + area(-2));

        System.out.println("Area do Retangulo Base 7, Altura 6 =  " + area (7,6));
        System.out.println("Area do Retangulo Base 5, Altura 4 = " + area (5,4));

    }

}
