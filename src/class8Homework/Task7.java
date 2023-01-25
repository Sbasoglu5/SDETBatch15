package class8Homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();
        boolean prime=true;
        for (int i = 2; i <number; i++) {
            if (number%i==0){
                prime=false;
                break;
            }
        }
        if (prime==true){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number+" is not a prime number");
        }

    }
}
