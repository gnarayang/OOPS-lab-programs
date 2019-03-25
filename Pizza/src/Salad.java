import java.util.ArrayList;
import java.util.Scanner;

public class Salad extends Item {
    public Salad(String name, int fats, int carbohydrates_proteins, boolean takeaway, int combo, int cost) {
        super(name, fats, carbohydrates_proteins, takeaway, combo, cost);
    }

    ArrayList<String> toppings = new ArrayList<String>();
    Ingredients_List ingredients_list = new Ingredients_List();

    void displayInBill(){
        super.displayInBill();
        System.out.print("With added toppings");
        for (String top : toppings)
            System.out.print(top +" ");
        System.out.println(" ");
    }

    void addToppings(){
        System.out.println("Press 1 to add the displayed ingredients");
        for(Ingredient ingredient : ingredients_list.saladTopings){
            ingredient.display_ingredient();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                fats += ingredient.fats;
                carbohydrates_proteins += ingredient.carbohydrates_proteins;
                cost += ingredient.cost;
            }
        }
    }

}
