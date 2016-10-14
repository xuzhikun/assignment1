/**
 * Created by xuzhi on 10/14/2016.
 */
public class IceCream extends DessertItem {
    protected double price;

    public IceCream(String name, double price) {
        super(name);
        this.price = price / 100;
    }

    @Override
    public double getCost() {
        return price;
    }
}
