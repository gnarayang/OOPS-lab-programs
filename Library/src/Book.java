public class Book {
    String name;
    String publisher;
    String author;
    int daysLeft;
    boolean borrowed;

    Book(){

    }

    public Book(String name, String publisher, String author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    void displayBook(){
        System.out.println("Book " + name + " written by " + author + " published by " + publisher);
    }

}
