import java.util.*;

public class AddTwoNumbers {
    //function to add two numbers
    static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("addition of two numbers: ");
        System.out.println(add(a, b));
    }
}
