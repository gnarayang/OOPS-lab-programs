import java.util.ArrayList;
import java.util.Scanner;

public class CustomerList {
    ArrayList<Customer> customers = new ArrayList<>();

    CustomerList(){
        for(int i=0; i < 10 ; i++)
        {
            if(i < 5)
                customers.add(new Customer("user" + i,true));
            else
                customers.add(new Customer("user" + i, false));
        }
    }

    void AddNewCustomer(){
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.println("Enter\n1 if the user is faculty\nenter 2 if the user is student");
        customer.faculty = (scanner.nextInt() == 1);
        System.out.println("Enter the name of the user");
        customer.name = scanner.next();
        customers.add(customer);
    }
}
