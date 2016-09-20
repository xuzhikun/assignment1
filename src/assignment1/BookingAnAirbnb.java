import java.util.List;

/**
 * Created by zhikunxu on 9/12/16.
 */
/* Book an airbnb

        Description :  A tourist wants to book a house on Airbnb app.

        Objects:
        Object : Customer
        State : name, address
        Behavior : visitWebsite(), findRooms(), placeOrder(), payMoneyToWebsite()


        Object : Airbnb
        State : Collection of rooms
        Behavior : displayRooms(), acceptPayment()

        Object : Room
        State : name, owner, style, address, price
        Behavior : getPrice, getName

        Object : Payment
        state : amount
*/

class Customer {
    String name;
    String address;
    void visitWebsite(Airbnb airbnb){}
    Room findRoom(Room[] room){}
    void placeOrder(Room room){}
    Payment4Room payMoneyToWebsite(Airbnb airbnb){}

}

class Airbnb {
    Room[] rooms; //Array of Room
    Room[] displayRooms(Room rooms[]){}
    void acceptPayment(Customer customer, Payment4Room money){}
}

class Room {
    String name;
    String owner;
    String style;
    String address;
    Float price;
    Float getPrice(){}
    String getName(){}
}

class Payment4Room {
    float amount;
}

class BookingAirbnb {
    public static void main(String args[]){
        Airbnb airbnb = new Airbnb();

        Room room1 = new Room(); room1.name = "sweet home";
        Room room2 = new Room(); room2.name = "great home";
        Room[] rooms = {room1, room2};

        Customer jackson = new Customer();
        jackson.name = "Jackson";
        jackson.visitWebsite(airbnb);

        Room[] roomsDisplayed = airbnb.displayRooms(rooms);
        Room room = jackson.findRoom(roomsDisplayed);
        jackson.placeOrder(room);
        Payment4Room payment = jackson.payMoneyToWebsite(airbnb);
        airbnb.acceptPayment(jackson, payment);
    }

}
