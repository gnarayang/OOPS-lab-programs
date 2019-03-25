import java.util.ArrayList;

public class Ingredients_List {
    ArrayList<Ingredient> pizzaIngredients = new ArrayList<>();
    ArrayList<Ingredient> saladTopings = new ArrayList<>();

    Ingredients_List(){
        pizzaIngredients.add(new Ingredient("Ingredient 1", 30, 20,30,false));
        pizzaIngredients.add(new Ingredient("Ingredient 2", 40, 20,40,false));
        pizzaIngredients.add(new Ingredient("Ingredient 3", 50, 30,50,false));

        saladTopings.add(new Ingredient("Topping 1", 3, 40,50,false));
        saladTopings.add(new Ingredient("Topping 1", 4, 50,50,false));
        saladTopings.add(new Ingredient("Topping 1", 2, 30,50,false));
    }

}
