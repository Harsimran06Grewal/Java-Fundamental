import java.util.*;
public class CelsiusFahrenheit {
    //function to convert celsius to fahrenheit
    static int celsiusFahrenheit(int temp){
        return (temp * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        int temp = in.nextInt();

        System.out.println("temperature in fahrenheit: ");
        System.out.println(celsiusFahrenheit(temp));
    }
}
