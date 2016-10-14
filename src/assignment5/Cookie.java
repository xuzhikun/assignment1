/**
 * Created by xuzhi on 10/14/2016.
 */
public class Cookie extends DessertItem {
    public int number;
    public int price;

    public Cookie(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price / 100;
    }

    @Override
    public double getCost() {
        return (double)(Math.round((price / 12.0 * number) / 100.0));
    }
}
