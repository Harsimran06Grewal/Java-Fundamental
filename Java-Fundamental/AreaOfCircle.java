import java.util.*;

public class AreaOfCircle {
    //function to find area of circle
    static double area(int radius){
        final double PI = 3.14;
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius = in.nextInt();

        System.out.println("Area of Circle: ");
        System.out.println(area(radius));
    }
}
