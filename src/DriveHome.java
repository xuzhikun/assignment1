/**
 * Created by zhikunxu on 9/12/16.
 */
/*  Drive home

        Description :  A student is driving home from school.

        Objects:
        Object : Student
        State : name, driveExp, homeAddress, schoolAddress
        Behavior : drive(), openDoor(), lockDoor(), park()

        Object : Car
        State : color, type, brand

        Object : Road
        State : length
        Behavior : getLength

*/

class StudentD {
    String name;
    Integer driveExp;
    String homeAddress;
    String schoolAddress;
    void drive(Car car, Road road){}
    void openDoor(Car car){}
    void lockDoor(Car car){}
    void park(Car car, String homeAddress){}
}

class Car {
    String color;
    String type;
    String brand;
}

class Road {
    Float length;
    Float getLength(){}
}


class DriveHome {
    public static void main(String args[]){
        Car car = new Car();
        car.brand = "BMW"; car.color = "white"; car.type = "SUV";

        StudentD jack = new StudentD();
        jack.schoolAddress = "201 Terry Ave";
        jack.homeAddress = "76th Ave";
        Road road = new Road();
        road.length = 10.0f;

        jack.openDoor(car);
        jack.drive(car, road);
        jack.park(car, jack.homeAddress);
        jack.lockDoor(car);
    }

}
