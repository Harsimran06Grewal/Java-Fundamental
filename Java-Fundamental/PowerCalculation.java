import java.util.Scanner;

public class PowerCalculation {
    //function to calculate power
    static int powerCal(int base, int exponent){
       // return Math.pow(base, exponent);

        //or

        if(exponent == 0){
            return 1;
        }
        
        return base * powerCal(base, exponent - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of base: ");
        int base = in.nextInt();

        System.out.println("Enter value of exponent: ");
        int exponent = in.nextInt();

        System.out.println(powerCal(base, exponent));
    }
}
