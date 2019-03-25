public class Ingredient {
    String name;
    int fats;
    int carbohydrates_proteins;
    int cost;
    boolean add;

    Ingredient(){

    }

    public Ingredient(String name, int fats, int carbohydrates_proteins, int cost, boolean add) {
        this.name = name;
        this.fats = fats;
        this.carbohydrates_proteins = carbohydrates_proteins;
        this.cost = cost;
        this.add = add;
    }

    void display_ingredient(){
        System.out.println("The name is " + name);
        System.out.println("The weight in grams of fats is " + fats);
        System.out.println("The weight in grams of carbohydrates and proteins is " + carbohydrates_proteins);
        System.out.println("The cost is " + cost);
    }

}
