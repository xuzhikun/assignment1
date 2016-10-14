import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuzhi on 10/14/2016.
 */
public class Checkout {
    private List<DessertItem> list;
    DessertShoppe dessertShoppe = new DessertShoppe();

    public Checkout() {
        list = new ArrayList<>();
    }

    public int numberOfItems() {
        return list.size();
    }

    public void enterItem(DessertItem item) {
        list.add(item);
    }

    public void clear() {
        list.clear();
    }

    public double totalCost() {
        double total = 0;
        for (DessertItem d : list) {
            total += d.getCost();
        }
        return total;
    }

    public double totalTax() {
        return dessertShoppe.tax * this.totalCost();
    }

    public String toString() {
        String res = "           " + dessertShoppe.storeName + "\n" + "------------------------------------\n";
        for (DessertItem d : list) {
            if (d instanceof Candy)
                res += ((Candy) d).weight + " lbs.  @  " + ((Candy) d).price + " /lb.\n";
            if (d instanceof Cookie)
                res += ((Cookie) d).number + " @  " + ((Cookie) d).price + " /dz.\n";
            res += String.format("%-30s %5s" , d.getName(), d.getCost()) + "\n";
        }
        res += String.format("%-31s %.2f" , "Tax",this.totalTax()) + "\n";
        res += String.format("%-31s %.2f" , "Total cost", this.totalCost() + this.totalTax()) + "\n";
        return res;
    }
}
