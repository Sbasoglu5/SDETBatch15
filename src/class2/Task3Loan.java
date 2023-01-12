package class2;

import java.util.Scanner;

public class Task3Loan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int loan= scan.nextInt();
        int amount=200000;

        if (amount<=200000){
            System.out.println("You are approved!");
        }else{
            System.out.println("Sorry! You are not eligible for loan");
        }
    }
}
