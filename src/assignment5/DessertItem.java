/**
 * Created by xuzhi on 10/14/2016.
 */
public abstract class  DessertItem {
    protected String name;

    public DessertItem(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public abstract double getCost();
}
