import java.util.Scanner;

public class SimpleInterest {
    //function to find simple interest 
    static int simpleInterest(int principal, int rate, int time){
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of principal: ");
        int principal = in.nextInt();

        System.out.println("Enter value of rate: ");
        int rate = in.nextInt();

        System.out.println("Enter value of time: ");
        int time = in.nextInt();

        System.out.println(simpleInterest(principal, rate, time));
    }
}
