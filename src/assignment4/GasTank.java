/**
 * Created by xuzhi on 10/4/2016.
 */
public class GasTank {
    private double amount = 0;

    public void addGas(double add) {
        this.amount += add;
    }

    public void useGas(double use) {
        this.amount -= use;
    }

    public double getGasLevel() {
        return this.amount;
    }
}
