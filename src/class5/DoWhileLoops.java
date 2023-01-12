package class5;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       /* int number;
        do{
            System.out.println("Please enter a number");
            number=input.nextInt();
        }while (number!=5);*/

        int num;

        do {
            System.out.println("Please enter a number between 0 to 5");
            num= input.nextInt();
        }while(num>5||num<0);
        System.out.println(num+" is between 0 to 5");


    }
}