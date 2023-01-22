package ReviewClass;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i <=5; i++) {
            System.out.println("Please enter item and its price");
            String item = inp.next();
            item+= inp.nextLine();
            double price = inp.nextDouble();

            totalPrice = totalPrice + price;
            System.out.println("This is what you pay " + totalPrice + "$");
        }
        System.out.println("Please pay for the items");
        double amountPaid= inp.nextDouble();
        if (amountPaid>totalPrice){
            System.out.println("Here is your change "+(amountPaid-totalPrice)+"$");
            System.out.println("Thank you for shopping with us");
        } else {
            System.out.println("You can't complete the purchase");
        }


    }
}
