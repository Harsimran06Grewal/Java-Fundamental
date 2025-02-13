import java.util.Scanner;

public class PostiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating array having 5 elements
        int arr[] = new int[5];

        //input elements in array
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            //condition if element at array's index is positive
            if(arr[i] > 0){
                System.out.print(" Positive Number" + " and ");
                //condition if element at array's index is positive and Even Number
                if(arr[i] % 2 == 0){
                    System.out.println(" Even Number");
                }
                //condition if element at array's index is positive and Odd Number
                else{
                    System.out.println(" Odd Number");
                }
            }
            //condition if element at array's index is zero
            else if(arr[i] == 0){
                System.out.println(" Zero");
            }
            //condition if element at array's index is negative
            else if(arr[i] < 0){
                System.out.println(" Negative Number");
            }
        }

        //condition if element at array's first index is greater than element array's last index
        if(arr[0] > arr[4]){
            System.out.println(" First element  is greater");
        }
        //condition if element at array's last index is greater than element array's first index
        else if(arr[0] < arr[4]){
            System.out.println(" Last element is greater");
        }
        //condition if element at array's first index and element array's last index are equal
        else if(arr[0] == arr[4]){
            System.out.println("Both first and last elements are equal");
        }

        input.close();
    }
}
