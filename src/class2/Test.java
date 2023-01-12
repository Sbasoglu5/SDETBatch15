package class2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your gender:F or M");
        char gender=input.next().charAt(0);

        System.out.println("Please enter your age");
        int age= input.nextInt();

        if(gender=='M') {
            if (age > 25) {
                System.out.println("Man");
            } else {
                System.out.println("boy");
            }
        }
        if (gender=='F') {
            if (age > 25) {
                System.out.println("Woman");
            } else {
                System.out.println("Girl");
            }
        }
    }
}
