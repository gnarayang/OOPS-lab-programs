import java.util.Date;

public class Book {
    String name;
    String publisher;
    String author;
    Date date = new Date();
    int daysLeft;
    boolean borrowed;
    Customer borrower = new Customer();

    Book(){

    }

    public Book(String name, String publisher, String author, boolean borrowed) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.borrowed = borrowed;
    }

    void displayBook(){
        System.out.println("Book " + name + " written by " + author + " published by " + publisher);
    }

}
