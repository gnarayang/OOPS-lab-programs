import java.util.Calendar;
import java.util.Scanner;

public class Librarian {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        BooksList booksList = new BooksList();
        CustomerList customerList = new CustomerList();
        System.out.println("Enter\n1 to perform librarian functions\n2 to perform borrower functions\n-1 to end");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int choice1;
        while (choice != -1)
        {
            if(choice == 1)
            {
                System.out.println("Enter\n1 to add a book\n2 to delete a book\n3 to view books\n4 to view issued books\n5 to change the date\n6 to add a user");
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
                        int check = 0;
                        for (Book book: booksList.books)
                        {
                            if(book.borrowed){
                                book.displayBook();
                                System.out.println(" borrowed by " + book.borrower.name);
                                check = 1;
                            }
                        }
                        if(check == 0)
                        {
                            System.out.println("No books are issued");
                        }
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Enter how much the date must increase by");
                        int days = scanner.nextInt();
                        calendar.add(Calendar.DATE, days);
                        System.out.print("The date today is "+ calendar.toString());
                        for (Customer customer: customerList.customers)
                        {
                            for (Book book : customer.overdueBooks)
                            {
                                book.daysLeft -= days;
                            }
                            for (Book book : customer.borrowedBooks)
                            {
                                book.daysLeft -= days;
                                if (book.daysLeft < 0)
                                {
                                    customer.overdueBooks.add(book);
                                }
                            }
                            for (Book book : customer.overdueBooks)
                            {
                                customer.fine = Math.abs(book.daysLeft)* 2.5;
                                if(book.daysLeft < -7)
                                {
                                    customer.fine += Math.abs(book.daysLeft + 7)* 2.5;
                                }
                            }
                            System.out.println(customer.name + " has a fine of " + customer.fine);
                        }
                        break;
                    }
                    case 6:
                    {
                        customerList.AddNewCustomer();
                        break;
                    }
                }
            }
            else if (choice == 2)
            {
                System.out.println("Enter\n1 to search book by authors\n2 to search by publishers\n3 to view most recently added books\n4 to borrow a book\n5 to return a book");
                choice1 = scanner.nextInt();
                switch (choice1)
                {
                    case 1:
                    {
                        System.out.println("Enter the author's name");
                        int check = 0;
                        String author = scanner.next();
                        for (Book book: booksList.books )
                        {
                            if(book.author.equals(author) && !book.borrowed)
                            {
                                book.displayBook();
                                check = 1;
                            }
                        }
                        if(check == 0)
                        {
                            System.out.println("There are no books of the entered author");
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Enter the publisher's name");
                        int check = 0;
                        String publisher = scanner.next();
                        for (Book book: booksList.books )
                        {
                            if(book.publisher.equals(publisher) && (!book.borrowed))
                            {
                                book.displayBook();
                                check = 1;
                            }
                        }
                        if(check == 0)
                        {
                            System.out.println("There are no books of the entered publisher");
                        }
                        break;
                    }
                    case 3:
                    {
                        for (int i=0; i < 10; i++)
                        {
                            booksList.books.get(booksList.books.size() - 1 - i).displayBook();
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter the name of the customer");
                        String customerName = scanner.next();
                        int check=0;
                        for (Customer customer : customerList.customers)
                        {
                            if(customer.name.equals(customerName))
                            {
                                System.out.println("Enter the name of the book");
                                String name = scanner.next();
                                for (Book book : booksList.books) {
                                    if (book.name.equals(name) && ((customer.faculty && customer.borrowedBooks.size() < 4)) || (!customer.faculty && customer.borrowedBooks.size() < 2)) {
                                        check = 1;
                                        booksList.books.get(booksList.books.indexOf(book)).borrowed = true;
                                        if(customer.faculty)
                                        {
                                            book.daysLeft = 29;
                                        }
                                        else
                                        {
                                            book.daysLeft = 14;
                                        }
                                        customer.borrowedBooks.add(book);
                                        book.borrower = customer;
                                        System.out.println("Borrowed successfully on "+ calendar.toString());
                                        break;
                                    }
                                }
                                if(check == 1)
                                {
                                    break;
                                }
                            }
                        }
                        if(check != 1)
                        {
                            System.out.println("Borrow not successful");
                        }
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Enter the name of the customer");
                        String customerName = scanner.next();
                        int check=0;
                        Book book1 = null;
                        for (Customer customer : customerList.customers)
                        {
                            if(customer.name.equals(customerName)) {
                                System.out.println("Enter the name of the book");
                                String name = scanner.next();
                                int i = 0;
                                for (Book book : customer.borrowedBooks) {
                                    if (book.name.equals(name)) {
                                        System.out.println("Return successful");
                                        i = booksList.books.indexOf(book);
                                        book1 = book;
                                        check = 1;
                                    }
                                }
                                if (check == 1) {
                                    booksList.books.get(i).borrowed = false;
                                    customer.borrowedBooks.remove(book1);
                                    if (customer.overdueBooks.contains(book1))
                                        customer.overdueBooks.remove(book1);
                                    break;
                                }
                            }
                        }
                        if(check != 1)
                        {
                            System.out.println("Return not successful");
                        }
                        break;
                    }
                    default:
                    {
                        System.out.println("Wrong entry");
                    }
                }
            }
            System.out.println("Enter\n1 to perform librarian functions\n2 to perform borrower functions\n-1 to end");
            choice = scanner.nextInt();
        }
    }
}
