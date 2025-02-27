package STUDYJAVA.exercises.ControlFLow;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 3));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(6.4, 2.2));

    }
    public static int getBucketCount(double widht, double height, double areaPerBucket,int extraBuckets) {
        if (widht <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = widht * height;
        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);
        return Math.max(0, bucketsNeeded - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
            return -1;
        }
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
