/* Pay tuition

        Description :A student wants to pay his tuition through myNEU account.

        Objects:
        Object : Student
        State : studentId, name, major, address
        Behavior : visitMyNEUPortal(), chooseBill(), confirmMyBill(), payMoneyToMyNEU()


        Object : MyNEU
        State : bill information
        Behavior : displayBills(), acceptTuition()

        Object : Bill
        State : billId, course, totalCredits

        Object : Payment
        state : routingNum, accountNum, amount
*/

class Student {
    Integer studentId;
    String name;
    String major;
    String address;
    void visitMyNEUPortal(MyNEU myNEU){}
    void chooseBill(Bill[] bills){}
    boolean confirmMyBill(Bill bill){}
    boolean payMoneyToMyNEU(Payment payment){}

}

class MyNEU {
    Bill[] bills; //Array of Bill
    Bill[] displayBills(Student student, Bill[] bills){}
    void acceptTuition(Student student, Payment money){}

}

class Bill {
    Integer billId;
    String courses;
    Integer totalCredits;
}

class Payment {
    String routingNum;
    String accountNum;
    float amount;
}

class PayTuition {
    public static void main(String args[]){
        MyNEU myNEU = new MyNEU();

        Bill bill1 = new Bill();bill1.billId = 1;
        Bill bill2 = new Bill();bill2.billId = 2;
        Bill[] bills = {bill1, bill2};

        Student jack = new Student();
        jack.studentId = 1;
        jack.major = "info sys";
        jack.name = "jack";

        jack.visitMyNEUPortal(myNEU);
        Bill[] jackBill = myNEU.displayBills(jack, bills);
        jack.chooseBill(jackBill);
        Payment payment = new Payment();
        payment.accountNum = "1111";
        payment.amount = 10000;
        myNEU.acceptTuition(jack, payment);
    }

}