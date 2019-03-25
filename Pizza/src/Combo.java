public class Combo {
    String name;
    Pizza pizza;
    Juice juice;
    Salad salad;
    int fats;
    int carbohydrates_proteins;
    boolean takeaway;
    int calories;
    int cost;

    public Combo(String name, Pizza pizza, Juice juice, Salad salad, int cost) {
        this.pizza = pizza;
        this.juice = juice;
        this.salad = salad;
        this.name = name;
        this.cost = cost;
        this.takeaway =false;
        fats = pizza.fats + juice.fats + salad.fats;
        carbohydrates_proteins = pizza.carbohydrates_proteins + juice.carbohydrates_proteins + salad.carbohydrates_proteins;
        calories = pizza.calories + juice.calories + salad.calories;
    }

    void displayCombo(){
        System.out.println("The combo" + name + " has");
        System.out.println("Pizza "+ pizza.name);
        System.out.println("Juice "+ juice.name);
        System.out.println("Salad "+ salad.name);
        System.out.println("Fats " + fats + " grams");
        System.out.println("Carbohydrates and proteins " + carbohydrates_proteins + " grams");
        System.out.println("Calories " + calories);
        System.out.println("Cost " + cost);
    }

    void displayInBill(){
        System.out.print(name +"\t\t"+ calories +"\t\t"+ cost+"\t\t");
        System.out.println("contains " + pizza.name + " " + salad.name + " " + juice.name);
    }
}
