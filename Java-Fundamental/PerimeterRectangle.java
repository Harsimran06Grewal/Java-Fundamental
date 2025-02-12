import java.util.Scanner;

public class PerimeterRectangle { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of length: ");
        int length = in.nextInt();

        System.out.println("Enter value of breadth: ");
        int breadth = in.nextInt();

        //to calculate perimeter of rectangle
        int perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }
}
