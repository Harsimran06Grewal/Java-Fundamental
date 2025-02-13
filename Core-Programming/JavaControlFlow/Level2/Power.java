import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        int number = input.nextInt();

        //get power input from user
        int power = input.nextInt();

        int result = 1;

        for(int i = 1; i <= power; i++){
            result *= number;
        }

        System.out.println(number + " power " + power + " is " + result);

        input.close();
    }
}
