import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        double number = input.nextInt();

        //variable sum
        int sum = 0;

        while(number != 0.0){
            sum += number;
        }

        System.out.println();
        
    }
}
