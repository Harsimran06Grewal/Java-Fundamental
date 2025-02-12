import java.util.Scanner;

public class KilometresMiles {
    //function to convert kilometers to miles
    static double kiloMiles(int distance){
        return distance * 0.621371;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of distance in kilometers: ");
        int distance = in.nextInt();

        System.out.println("value of distance in miles: ");
        System.out.println(kiloMiles(distance));
    }
}
