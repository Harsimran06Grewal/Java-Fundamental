package Level1;

class Book{
    //Attributes
    String title;
    String author;
    int price;

    //Constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display details of book
    void displayDetails(){
        System.out.println("Title of Book is: " + title + " , Author of Book is: " + author + " , price of book is: " + price);
    }
}


public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F.Scott Fitzgerald", 3400);
        book.displayDetails();
    }
}
