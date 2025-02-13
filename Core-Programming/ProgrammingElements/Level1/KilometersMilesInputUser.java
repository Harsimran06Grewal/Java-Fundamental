package Week1.ProgrammingElements;

import java.util.Scanner;

public class KilometersMilesInputUser {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter distance in kilometer
        double km = input.nextDouble();

        //converting distance from km to miles
        double miles = km * 1.6;

        System.out.println(" The total miles is " + miles + " mile for the given " + km + "km");
    }
}
