package ReviewClass;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*While loops
        * when we don't know how many times we need to repeat a block of code */
        /*int a=0;
        do {
            System.out.println("do");
            a++;
        }while (a<5);*/

        Scanner input=new Scanner(System.in);
        /*String answer;
            do {
            System.out.println("Do you understand loops ?");
            answer=input.nextLine();
        }while (!answer.equalsIgnoreCase("Yes"));
        System.out.println("You good to move to array");*/

        System.out.println("Do you understand loops?");
        String answer= input.nextLine();
        boolean condition=true;
        while (condition) {
            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("You need to practice more");
            } else {
                System.out.println("You good to go");
            }
            condition=false;
        }
    }
}
