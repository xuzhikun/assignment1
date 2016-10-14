/**
 * Created by xuzhi on 10/14/2016.
 */
public class DessertShoppe {
    public final double tax = 0.01;
    public final String storeName = "QFC Seattle";
    public final int maxLength = 30;
    public final int priceWidth = 5;

    public double cents2dollarsAndCents(int cents) {
        return cents / 100.0;
    }
}
