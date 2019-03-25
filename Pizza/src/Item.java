public class Item {
    String name;
    int fats;
    int carbohydrates_proteins;
    boolean takeaway;
    int combo;
    int calories;
    int cost;

    Item(){
        calories = carbohydrates_proteins*4 + fats*9;
    }

    Item(String name, int fats, int carbohydrates_proteins, boolean takeaway, int combo, int cost){
        this.name = name;
        this.takeaway = takeaway;
        this.combo = combo;
        this.fats = fats;
        this.carbohydrates_proteins = carbohydrates_proteins;
        this.calories = carbohydrates_proteins*4 + fats*9;
        this.cost = cost;
    }

    void addAC(){
        cost+= 20;
    }

    void addTakeaway(){
        cost+= 10;
    }

    void displayItem(){
        System.out.print("Item " + name);
        System.out.print(" has " + fats +" grams of fat");
        System.out.print(" has " + carbohydrates_proteins +" grams of Carbohydrates and proteins");
        System.out.print(" that is " + calories + " calories");
        System.out.println(" costs "+ cost);
    }

    void displayInBill(){
        System.out.print(name +"\t\t"+ calories +"\t\t\t"+ cost+"\t\t");
    }

}
