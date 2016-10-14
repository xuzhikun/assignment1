/**
 * Created by xuzhi on 10/14/2016.
 */
public class Sundae extends IceCream {
    private String topping;
    private double tPrice;

    public Sundae(String name, double price, String topping, double tPrice) {
        super(name, price);
        this.topping = topping;
        this.tPrice = tPrice / 100;
    }

    public double getPrice() {
        return tPrice + super.price;
    }
}
