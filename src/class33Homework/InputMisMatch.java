package class33Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a whole number");
        try{
            int number= input.nextInt();
        }catch (InputMismatchException i){
            System.out.println("Please enter a valid value");
        }



    }
}
