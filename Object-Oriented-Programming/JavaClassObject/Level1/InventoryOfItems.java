package Level1;

class Item{
    int itemCode;
    String itemName;
    int price;

    //Constructor
    Item(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //method to display item details
    void displayDetails(){
        System.out.println("code of item is: " + itemCode + " , name of item is: " + itemName + " , and price of item is: " + price);
    }

    //calculate total cost of given quantity
    int calculateCost(int quantity){
        return quantity * price;
    }
}


public class InventoryOfItems {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 799);
        item1.displayDetails();

        System.out.println("total cost for given quantity: " + item1.calculateCost(3));

    }
}
