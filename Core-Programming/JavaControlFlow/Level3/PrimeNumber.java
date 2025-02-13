import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from the user
        int number = input.nextInt();

        if(number % number == 0){
            System.out.println(number + " is a prime number");
        }
    }
}
