import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Pizza> pizza_list = new ArrayList<>();
    ArrayList<Juice> juice_list = new ArrayList<>();
    ArrayList<Salad> salad_list = new ArrayList<>();
    ArrayList<Combo> combo_list = new ArrayList<>();
    int[] orders = new int[12];
    int fats;
    int carbohydrates_proteins;
    int calories;
    int cost;

    Menu(){
        pizza_list.add(new Pizza("Pizza1", 50, 100, true, 1,100));
        pizza_list.add(new Pizza("Pizza2", 60, 90, true, 2,150));
        pizza_list.add(new Pizza("Pizza3", 80, 120, true, 3,200));

        juice_list.add(new Juice("Juice1", 10, 10, true, 2,30));
        juice_list.add(new Juice("Juice2", 10, 20, true, 3,40));
        juice_list.add(new Juice("Juice3", 20, 10, true, 1,50));

        salad_list.add(new Salad("Salad1", 10, 110,false,3,70));
        salad_list.add(new Salad("Salad2", 20, 100,false,1,80));
        salad_list.add(new Salad("Salad3", 20, 120,false,2,90));

        combo_list.add(new Combo("Combo1", pizza_list.get(0), juice_list.get(2), salad_list.get(1), 150));
        combo_list.add(new Combo("Combo2", pizza_list.get(1), juice_list.get(0), salad_list.get(2), 250));
        combo_list.add(new Combo("Combo3", pizza_list.get(2), juice_list.get(1), salad_list.get(0), 375));
    }

    void displayOrder(){
        for (int i : orders){
            if(i <3){
                if(i > 0){

                }
            }
        }
    }

}
