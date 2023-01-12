package class4;

import java.util.Scanner;

public class WhileLoopRecap {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=input.nextInt();

        while (number<20){
            System.out.println(number<20);
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);


        }
    }
}
