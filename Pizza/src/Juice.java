public class Juice extends Item {
    public Juice(String name, int fats, int carbohydrates_proteins, boolean takeaway, int combo, int cost) {
        super(name, fats, carbohydrates_proteins, takeaway, combo, cost);
    }

    boolean cold;

    void displayInBill(){
        super.displayInBill();
        if(cold)
            System.out.print("Cold\n");
        else
            System.out.println("Hot\n");
    }

}
