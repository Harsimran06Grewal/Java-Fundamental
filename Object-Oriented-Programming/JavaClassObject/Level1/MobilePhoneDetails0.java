package Level1;

class MobilePhone{
    //Attributes
    String brand;
    String model;
    int price;

    //Constructor
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //method to display details of phone
    void displayDetails(){
        System.out.println("Mobile Phone Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails0 {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 999);
        phone1.displayDetails();
        
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 899);
        phone2.displayDetails();
    }
}
