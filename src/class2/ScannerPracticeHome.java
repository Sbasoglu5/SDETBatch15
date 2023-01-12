package class2;

import java.util.Scanner;
import java.util.SortedMap;

public class ScannerPracticeHome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("WHAT IS YOUR NAME?");
        String name=scan.nextLine();

        System.out.println("WHAT IS YOUR AGE?");
        int age=scan.nextInt();

        System.out.println("WHAT IS YOUR OCCUPATION?");
        String occupation=scan.next();

        System.out.println("WHAT IS YOUR MOTTO?");
        String motto=scan.next();
        motto+=scan.nextLine();
        System.out.println("Thank you "+name+"! You're " +age+" years old, Your are a "+occupation+", Your motto is "+motto+".");

    }
}
