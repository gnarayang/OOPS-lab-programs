import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {
    ArrayList<Customer> customers = new ArrayList<>();

    CustomerList(){
        for(int i=0; i < 10 ; i++)
        {
            customers.add(new Customer("User " + i,Math.random()%2 == 0));
        }
    }

    void AddNewCustomer(){
        System.out.println("Enter the name of the user");
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        customer.name = scanner.next();
        System.out.println("Enter 1 if the user is faculty");
        customer.faculty = (scanner.nextInt() == 1);
        customers.add(customer);
    }
}
