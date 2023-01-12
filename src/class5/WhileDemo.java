package class5;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        boolean condition=true;
        int number=5;
        while (condition){
            System.out.println("Please enter a number between 0 to 20");
            int userInput= input.nextInt();
            if (userInput>number){
                System.out.println("You entered number is greater ");
            } else if (userInput<number) {
                System.out.println("you entered number is smaller");
            }else{
                System.out.println("You've won!");
                condition=false;
            }
        }
    }
}
