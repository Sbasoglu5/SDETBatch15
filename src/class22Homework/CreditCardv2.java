package class22Homework;

public class CreditCardv2 {

    double balance;
    double interest;

    public CreditCardv2(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        System.out.println("interest " + (balance * interest / 100));
    }

}
class Visav2 extends CreditCardv2{

    public Visav2(double balance, double interest) {
        super(balance, interest);
    }
}
class AXv2 extends CreditCardv2{

    public AXv2(double balance, double interest) {
        super(balance, interest);
    }
    @Override
    public void calculateInterest() {
        System.out.println("interest " + (balance * interest / 100)+" plus 30$ registration fee");
    }

    public static void main(String[] args) {
        CreditCardv2 creditCardv2=new CreditCardv2(100,10);
        creditCardv2.calculateInterest();

        Visav2 visav2=new Visav2(100,10);
        visav2.calculateInterest();

        AXv2 aXv2=new AXv2(100,10);
        aXv2.calculateInterest();
    }
}


