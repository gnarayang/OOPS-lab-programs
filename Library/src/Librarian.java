import java.util.Scanner;

public class Librarian {
    public static void main(String[] args) {
        BooksList booksList = new BooksList();
        System.out.println("Enter 1 to perform librarian functions\n2 to perform borrower functions\n-1 to end");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int choice1;
        while (choice != -1)
        {
            if(choice == 1)
            {
                System.out.println("Enter\n1 to add a book\n2 to delete a book\n3 to view books\n4 to view issued books\n");
                choice1 = scanner.nextInt();
                switch (choice1)
                {
                    case 1:
                    {
                        booksList.addBooks();
                        break;
                    }
                    case 2:
                    {
                        booksList.deleteBooks();
                        break;
                    }
                    case 3:
                    {
                        booksList.displayBooks();
                        break;
                    }
                    case 4:
                    {
                        for (Book book: booksList.books)
                        {
                            if(!book.borrowed){
                                book.displayBook();
                            }
                        }
                    }
                }
            }
            else if (choice == 2)
            {

            }
        }
    }
}
