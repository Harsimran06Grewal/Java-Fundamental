package Week1.ProgrammingElements;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //enter side of square
        int side = input.nextInt();

        //calculating perimeter of square
        int perimeter = 4 * side;

        System.out.println("The length of the side is " + side + "  whose perimeter is " + perimeter);
    }
}
