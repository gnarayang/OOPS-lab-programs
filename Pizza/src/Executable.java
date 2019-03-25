import java.util.ArrayList;
import java.util.Scanner;

public class Executable {

    public static void main(String[] args) {
        System.out.println("Enter\n1 for takeaway\n2 for in hotel");
        Scanner scanner = new Scanner(System.in);
        int takeaway = scanner.nextInt();
        if(takeaway == 1){
            int calories=0, cost=0;
            System.out.println("The menu is ");
            Menu menu = new Menu();
            for(Pizza pizza : menu.pizza_list){
                pizza.displayItem();
            }
//            for(Salad salad : menu.salad_list){
//                salad.displayItem();
//            }
            for(Juice juice: menu.juice_list){
                juice.displayItem();
            }
            OrderList orderList = new OrderList();
            System.out.println("Press\n1 to order a pizza\n2 to order a Juice\n3 to order a combo\n-1 to exit");
            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            int subchoice, subchoice1;
            while (choice != -1) {
                switch (choice) {
                    case 1: {
                        System.out.println("Press the pizza number you want to order");
                        subchoice = scanner.nextInt();
                        System.out.println("The entered pizza is in combo " + subchoice + " Press 4 to order combo or 1 to order pizza");
                        subchoice1 = scanner.nextInt();
                        if (subchoice1 == 1) {
                            orderList.pizzas.add(menu.pizza_list.get(subchoice));
                            orderList.pizzas.get(orderList.pizzas.size() - 1).addIngredients();
                        } else
                            orderList.combos.add(menu.combo_list.get(subchoice));
                        break;
                    }
                    case 2: {
                        System.out.println("Press the juice number you want to order");
                        subchoice = scanner.nextInt();
                        System.out.println("The entered juice is in combo " + (subchoice + 1) % 3 + " Press 4 to order combo or 1 to order juice");
                        subchoice1 = scanner.nextInt();
                        if (subchoice1 == 1) {
                            orderList.juices.add(menu.juice_list.get(subchoice));
                            System.out.println("Enter 1 for the juice to be cold 2 for regular");
                            int cold = scanner.nextInt();
                            orderList.juices.get(orderList.juices.size() - 1).cold = (cold == 1);
                        } else
                            orderList.combos.add(menu.combo_list.get((subchoice + 1) % 3));
                        break;
                    }
//                    case 3: {
//                        System.out.println("Press the Salad number you want to order");
//                        subchoice = scanner.nextInt();
//                        System.out.println("The entered salad is in combo " + (subchoice + 2) % 3 + " Press 4 to order combo or 1 to order salad");
//                        subchoice1 = scanner.nextInt();
//                        if (subchoice1 == 1) {
//                            orderList.salads.add(menu.salad_list.get(subchoice));
//                            orderList.salads.get(orderList.salads.size() - 1).addToppings();
//                        } else
//                            orderList.combos.add(menu.combo_list.get((subchoice + 2) % 3));
//                        break;
//                    }
                    case 3: {
                        System.out.println("Press the combo number that you want");
                        subchoice = scanner.nextInt();
                        orderList.combos.add(menu.combo_list.get(subchoice));
                        break;
                    }
                    default: {
                        System.out.println("Wrong entry");
                    }
                }
                System.out.println("Press\n1 to order a pizza\n2 to order a Juice\n3 to order a Salad\n4 to order a combo\n-1 to exit");
                choice = scanner.nextInt();
            }
            System.out.println("Item name\tCalories\tCost\tExtra information");
            for (Pizza pizza : orderList.pizzas) {
                pizza.displayInBill();
                calories += pizza.calories;
                cost += pizza.cost;
            }
//            for (Salad salad : orderList.salads) {
//                salad.displayInBill();
//                calories += salad.calories;
//                cost += salad.cost;
//            }
            for (Juice juice : orderList.juices) {
                juice.displayInBill();
                calories += juice.calories;
                cost += juice.cost;
            }
            for (Combo combo : orderList.combos) {
                combo.displayInBill();
                calories += combo.calories;
                cost += combo.cost;
            }
            System.out.println("Total\t\t"+ calories + "\t\t" + cost);
        }
        else if(takeaway == 2){
            System.out.println("Enter\n1 if you want AC\n2 if you don't want AC");
            int ac = scanner.nextInt();
            int calories=0, cost=0;
            System.out.println("The menu is ");
            Menu menu = new Menu();
            for(Pizza pizza : menu.pizza_list){
                pizza.displayItem();
            }
            for(Salad salad : menu.salad_list){
                salad.displayItem();
            }
            for(Juice juice: menu.juice_list){
                juice.displayItem();
            }
            OrderList orderList = new OrderList();
            System.out.println("Press\n1 to order a pizza\n2 to order a Juice\n3 to order a Salad\n4 to order a combo\n-1 to exit");
            scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            int subchoice, subchoice1;
            while (choice != -1) {
                switch (choice) {
                    case 1: {
                        System.out.println("Press the pizza number you want to order");
                        subchoice = scanner.nextInt();
                        System.out.println("The entered pizza is in combo " + subchoice + " Press 4 to order combo or 1 to order pizza");
                        subchoice1 = scanner.nextInt();
                        if (subchoice1 == 1) {
                            orderList.pizzas.add(menu.pizza_list.get(subchoice));
                            orderList.pizzas.get(orderList.pizzas.size() - 1).addIngredients();
                        } else
                            orderList.combos.add(menu.combo_list.get(subchoice));
                        break;
                    }
                    case 2: {
                        System.out.println("Press the juice number you want to order");
                        subchoice = scanner.nextInt();
                        System.out.println("The entered juice is in combo " + (subchoice + 1) % 3 + " Press 4 to order combo or 1 to order juice");
                        subchoice1 = scanner.nextInt();
                        if (subchoice1 == 1) {
                            orderList.juices.add(menu.juice_list.get(subchoice));
                            System.out.println("Enter 1 for the juice to be cold 2 for regular");
                            int cold = scanner.nextInt();
                            orderList.juices.get(orderList.juices.size() - 1).cold = (cold == 1);
                        } else
                            orderList.combos.add(menu.combo_list.get((subchoice + 1) % 3));
                        break;
                    }
                    case 3: {
                        System.out.println("Press the Salad number you want to order");
                        subchoice = scanner.nextInt();
                        System.out.println("The entered salad is in combo " + (subchoice + 2) % 3 + " Press 4 to order combo or 1 to order salad");
                        subchoice1 = scanner.nextInt();
                        if (subchoice1 == 1) {
                            orderList.salads.add(menu.salad_list.get(subchoice));
                            orderList.salads.get(orderList.salads.size() - 1).addToppings();
                        } else
                            orderList.combos.add(menu.combo_list.get((subchoice + 2) % 3));
                        break;
                    }
                    case 4: {
                        System.out.println("Press the combo number that you want");
                        subchoice = scanner.nextInt();
                        orderList.combos.add(menu.combo_list.get(subchoice));
                        break;
                    }
                    default: {
                        System.out.println("Wrong entry");
                    }
                }
                System.out.println("Press\n1 to order a pizza\n2 to order a Juice\n3 to order a Salad\n4 to order a combo\n-1 to exit");
                choice = scanner.nextInt();
            }
            System.out.println("Item name\tCalories\tCost\tExtra information");
            for (Pizza pizza : orderList.pizzas) {
                pizza.displayInBill();
                calories += pizza.calories;
                cost += pizza.cost;
            }
            for (Salad salad : orderList.salads) {
                salad.displayInBill();
                calories += salad.calories;
                cost += salad.cost;
            }
            for (Juice juice : orderList.juices) {
                juice.displayInBill();
                calories += juice.calories;
                cost += juice.cost;
            }
            for (Combo combo : orderList.combos) {
                combo.displayInBill();
                calories += combo.calories;
                cost += combo.cost;
            }
            if(ac == 1) {
                System.out.println("AC   \t\t" + 0 + "\t\t" + 50);
                cost += 50;
            }
            System.out.println("Total\t\t"+ calories + "\t\t" + cost);
        }
    }
}
