/**
 * Created by xuzhi on 10/4/2016.
 */
public class Car {
    private String brand;
    private String model;
    private String owner;
    private double price;
    private int produceYear;
    private String vinNum;
    private int capacity;

    public Car(String brand, String model, String owner, double price, int produceYear, int capacity, String vinNum) {
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.price = price;
        this.produceYear = produceYear;
        this.capacity = capacity;
        this.vinNum = vinNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVinNum() {
        return vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
