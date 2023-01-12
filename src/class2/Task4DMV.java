package class2;

import java.util.Scanner;

public class Task4DMV {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println("You are approved for driver license");
        }else{
            System.out.println("Please apply for learner permit");
        }
    }
}
