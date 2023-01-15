package class6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 5; i++) {


            System.out.println("Please enter the item and its price");
            String itemName = input.next();
            double itemPrice = input.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=input.nextDouble();

        if (amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Here is your change "+change);
            System.out.println("Thank you for shopping");
        } else if (amountPaid<totalPrice) {
            System.out.println("You can't buy all the items");
        }


    }

}
