/**
 * Created by xuzhi on 10/4/2016.
 */
public class Driver {
    private String name;
    private int age;
    private boolean gender;
    private Car car;

    public Driver(String name, int age, Car car, boolean gender) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.gender = gender;
    }

    public void addGas(double amount) {
        Car car = new Car("Audi", "SUV", "xx", 60000, 2016, 5, "xxx");
        car.getGasTank().addGas(15.0);
    }

    public void drive(Car car) {
        System.out.println("driving now!");
    }

    public void stop(Car car) {
        System.out.println("stop car now");
    }

}
