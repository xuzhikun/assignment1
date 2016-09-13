import java.util.Date;

/**
 * Created by zhikunxu on 9/12/16.
 */
/* Order for delivery

        Description : A consumer is going to order a delivery through phone calls.

        Objects:
        Object : consumer
        State : name, address, phoneNum
        Behavior : callToOrder(), payFeeByPhone(), placeOrder()


        Object : Order
        State : date, item, value, destination, note

        Object : UPS
        State : serviceNum, repId
        Behavior : pickUpCall(), acceptFee()

        Object : Payment
        state : amount
*/

class Consumer {
    String name;
    String address;
    String phoneNum;
    void callToOrder(UPS ups){}
    void placeOrder(Order order){}
    Payment4Del payFeeByPhone(UPS ups){}

}

class Order {
    Date date;
    String item;
    Integer value;
    String destination;
    String note;
}

class UPS {
    String serviceNum;
    Integer repId;
    void pickUpCall(Consumer customer){};
    void acceptFee(Payment4Del payment) {}
}

class Payment4Del {
    float amount;
}

class OrderForDelivery {
    public static void main(String args[]){
        Consumer mike = new Consumer();
        mike.name = "mike"; mike.address = "76th Ave";
        mike.phoneNum = "206xxxxxx";

        UPS ups = new UPS();
        mike.callToOrder(ups);
        ups.pickUpCall(mike);

        Order order = new Order();
        order.destination = "SEA"; order.item = "computer";
        mike.placeOrder(order);

        Payment4Del payment = mike.payFeeByPhone(ups);
        ups.acceptFee(payment);
    }

}
