import java.util.Scanner;

public class CanVote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get age input from user
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("The person's age is " +  age + " and can vote.");
        }
        else{
            System.out.println("The person's age is " +  age + " and cannot vote.");
        }

        input.close();
    }
}
