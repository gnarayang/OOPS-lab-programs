import java.util.ArrayList;
import java.util.Scanner;

public class BooksList {
    ArrayList<Book> books = new ArrayList<>();

    BooksList() {
        for (int i = 0; i < 50; i++) {
            books.add(new Book("Book" + i, "publisher" + i, "author" + i));
        }
    }

    void displayBooks(){
        for (Book book : books){
            book.displayBook();
        }
    }

    void addBooks(){
        System.out.println("Enter the name of the book");
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        book.name = scanner.next();
        System.out.println("Enter the Author's name");
        book.author = scanner.next();
        System.out.println("Enter the publisher's name");
        book.publisher = scanner.next();
        books.add(book);
    }

    void deleteBooks(){
        System.out.println("Enter the book number to be deleted");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        books.remove(i);
    }
}
