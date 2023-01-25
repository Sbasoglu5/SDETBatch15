package class10Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
       // How would you swap  2 strings without a temporary variable?
        Scanner input=new Scanner(System.in);
        System.out.println("Please input two whole numbers");
        int a=input.nextInt();
        int b=input.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
