package Week2.JavaConstructors.Level1;

class Book {
    //Attribute
    String title;
    String author;
    int price;

    //default constructor
    Book(){
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    //parameterized constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display details
    void getDetails(){
        System.out.println("title of book is: " + title);
        System.out.println("author of book is: " + author);
        System.out.println("price of book is: " + price);
    }
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1500);

        System.out.println("Details of Default Constructor: ");
        book.getDetails();

        System.out.println("Details of Parameterized Constructor: ");
        book1.getDetails();
    }
}
