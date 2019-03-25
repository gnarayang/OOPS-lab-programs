import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Book> borrowedBooks;
    ArrayList<Book> overdueBooks;
    int fine;
    boolean faculty;

    Customer(){

    }

    public Customer(String name,boolean faculty) {
        this.name = name;
        this.faculty = faculty;
    }
}
