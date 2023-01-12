package class2;

import java.util.Scanner;

public class Tasks6CreditCard {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String creditCard=input.nextLine();

        if (creditCard.equals("yes")){
            System.out.println("What is the your card balance?");
            int balance= input.nextInt();
            if (balance>1000){
                System.out.println("Please pay off your balance");
            }else{
                System.out.println("You still have enough credit available");
            }
        }else{
            System.out.println("Would you like to apply for a new card?");
        }



    }
}
