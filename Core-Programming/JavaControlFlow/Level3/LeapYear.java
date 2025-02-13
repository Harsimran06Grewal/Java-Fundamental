import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get year input from user
        int year = input.nextInt();

        if(year >= 1582){
            if(year % 400 == 0){
                System.out.println(year + " is a Leap Year");
            }
            else if(year % 100 == 0){
                System.out.println(year + " not a leap year");
            }
            else if(year % 4 == 0){
                System.out.println(year + " is a Leap Year");
            }
            else{
                System.out.println(year + " not a leap year");
            }
        }
        else{
            System.out.println(year + " is not a leap year");
        }

        input.close();
    }
}
