import java.util.Scanner;

public class AverageThreeNumbers {
    //function to find average of three numbers
    static int average(int a, int b, int c){
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = in.nextInt();

        System.out.println("Enter value of b: ");
        int b = in.nextInt();

        System.out.println("Enter value of c: ");
        int c = in.nextInt();

        System.out.println(average(a, b, c));
    }
}
