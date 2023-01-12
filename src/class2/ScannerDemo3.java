package class2;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you ready for holidays");
        boolean ready=input.nextBoolean();
        System.out.println("We god damn ready for holidays "+ready);
    }
}
