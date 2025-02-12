import java.util.*;

public class VolumeOfCylinder {
    //function to find volume of cylinder
    static double volume(int radius,int height){
        final double PI = 3.14;
        return PI * radius * radius * height;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius = in.nextInt();

        System.out.println("Enter height: ");
        int height = in.nextInt();

        System.out.println(volume(radius, height));
    }
}
