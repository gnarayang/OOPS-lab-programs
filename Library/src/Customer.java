import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    ArrayList<Book> overdueBooks = new ArrayList<>();
    double fine;
    boolean faculty;

    Customer(){

    }

    public Customer(String name,boolean faculty) {
        this.name = name;
        this.faculty = faculty;

    }
}
