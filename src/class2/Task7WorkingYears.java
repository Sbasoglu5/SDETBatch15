package class2;

import java.util.Scanner;

public class Task7WorkingYears {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How long have you worked?");
        int years= input.nextInt();

        System.out.println("What is your annual income?");
        int salary= input.nextInt();

        if (years>=5){
            System.out.println("Congratulations! You are eligible for ");
            if (salary>=50000){
                System.out.println("5000$");
            }else{
                System.out.println("3000$");
            }
        }else{
            System.out.println("Sorry! Unfortunately you are not eligible for any bonus");
        }
    }
}
