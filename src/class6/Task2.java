package class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


 boolean creditCard=true;
        Scanner input=new Scanner(System.in);
        while (creditCard){
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            System.out.println("Would you like a credit card?");
            String card= input.next();
            if (!card.equalsIgnoreCase("yes")){
                System.out.println("");
            }else {
                System.out.println("");
                creditCard=false;
            }
        }

//        Scanner input=new Scanner(System.in);
for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String response=input.next();
            if(response.equalsIgnoreCase("yes")){
                break;
            }

        }

//        Scanner input=new Scanner(System.in);
for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String response=input.next();
            if(response.equalsIgnoreCase("yes")){
                break;
            }
        }


    }
}
