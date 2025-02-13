import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get 3 numbers input from user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("Is the first number the largest? " + "Yes");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("Is the second number the largest? " + "Yes");
        }
        else{
            System.out.println("Is the third number the largest?" + "Yes");
        }

        input.close();
    }
}
