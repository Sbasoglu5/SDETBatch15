package class22Homework;

public class CreditCardTester {
    public static void main(String[] args) {
        Creditcard creditcard=new Creditcard();
        creditcard.interest(800000);
        Visa visa=new Visa();
        visa.interest(800000);
        AX ax=new AX();
        ax.interest(800000);

    }
}
