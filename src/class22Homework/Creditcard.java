package class22Homework;

public class Creditcard {
    /*Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance.
     Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
     Call the method by creating an object of each of the three classes.*/

    double balance;
    double interest;

    void interest(double balance){
        double interest=(balance/250000);
        System.out.println("Monthly interest based on for requested amount is "+interest+"%");
    }
}
class Visa{
    void interest(double balance){
        double interest=(balance/200000);
        System.out.println("Monthly interest based on for requested amount is "+interest+"%");
    }
}
class AX{
    void interest(double balance){
        double interest=(balance/320000);
        System.out.println("Monthly interest based on for requested amount is "+interest+"%");
    }
}

