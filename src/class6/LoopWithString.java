package class6;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");

        while (input.next().equalsIgnoreCase("Sezar")){
            System.out.println("Great student");
        }
    }
}
