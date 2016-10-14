/**
 * Created by xuzhi on 10/14/2016.
 */
public class Candy extends DessertItem {
    public int price;
    public double weight;

    public Candy(String name, double weight, int price) {
        super(name);
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getCost() {
        return (double)(Math.round((price * weight) / 100.0));
    }
}
