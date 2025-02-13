package Week1.ProgrammingElements;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //enter value of  unitprice
        int unitprice = input.nextInt();

        //enter value of quantity
        int quantity = input.nextInt();

        //calculating total price of an item
        int totalPrice = unitprice * quantity;

        System.out.println("he total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitprice);
    }
}
