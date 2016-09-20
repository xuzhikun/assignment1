
import java.util.Date;
import java.util.List;

/**
 * Created by zhikunxu on 9/12/16.
 */
/* Travelling to LA

        Description : A tourist is trying to find the cheapest flight to LA.

        Objects:
        Object : Tourist
        State : name, address, phoneNum, travelTime
        Behavior : getTicketsList(), comparePrice(), buyCheapest()


        Object : Ticket
        State : flightNum, price, airline, planeModel

        Object : WebSite
        State : ticketsList
        Behavior : showTickets()

        Object : Payment
        state : amount
*/

class Tourist {
    String name;
    String address;
    String phoneNum;
    Date TravelTime;
    void getTicketsList(Website website){}
    Ticket findCheapest(Ticket[] tickets){}
    Payment4Fly buyCheapest(Ticket ticket){}

}

class Ticket {
    Date date;
    String flightNum;
    Integer price;
    String airline;
    String planeModel;
}

class Website {
    List<Ticket> showTickets(Ticket[] tickets){}
    void acceptFee(Payment4Fly payment) {}
}

class Payment4Fly {
    float amount;
}

class TravellingToLA {
    public static void main(String args[]){
        Tourist jason = new Tourist();
        jason.name = "Jason";

        Website booking = new Website();
        jason.getTicketsList(booking);

        Ticket t1 = new Ticket(); t1.airline = "UA"; t1.planeModel = "747"; t1.price = 1000;
        Ticket t2 = new Ticket(); t2.airline = "Delta"; t2.planeModel = "787"; t2.price = 2000;
        Ticket[] tickets = new Ticket[]{t1, t2};
        booking.showTickets(tickets);

        Ticket t = jason.findCheapest(tickets);
        Payment4Fly payment4Fly = jason.buyCheapest(t);

        booking.acceptFee(payment4Fly);

    }

}
