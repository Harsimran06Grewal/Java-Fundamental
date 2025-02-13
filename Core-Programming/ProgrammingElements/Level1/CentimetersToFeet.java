package Week1.ProgrammingElements;

import java.util.Scanner;

public class CentimetersToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter height
        float height = input.nextFloat();

        //calculating height in feet
        float feet = 0.03f * height;

        //calculating height in inches
        float inches = 0.393f * height;

        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is" + inches);
    }
}
