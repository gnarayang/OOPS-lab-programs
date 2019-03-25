import java.util.ArrayList;
import java.util.Scanner;

public class Pizza extends Item{
    public Pizza(String name, int fats, int carbohydrates_proteins, boolean takeaway, int combo, int cost) {
        super(name, fats, carbohydrates_proteins, takeaway, combo, cost);
    }

    ArrayList<String> ingredients = new ArrayList<String>();
    Ingredients_List ingredients_list = new Ingredients_List();

    void displayInBill(){
        super.displayInBill();
        System.out.print("With added toppings");
        for (String ing : ingredients)
            System.out.print(ing +" ");
        System.out.println(" ");
    }

    void addIngredients(){
        System.out.println("Press 1 to add the displayed ingredients");
        for(Ingredient ingredient : ingredients_list.pizzaIngredients){
            ingredient.display_ingredient();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice == 1){
                ingredients.add(ingredient.name);
                fats += ingredient.fats;
                carbohydrates_proteins += ingredient.carbohydrates_proteins;
                cost += ingredient.cost;
            }
        }
    }
}
