package class4;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number");
        double num1= input.nextDouble();
        System.out.println("Please enter the operator");
        char operator=input.next().charAt(0);
        System.out.println("Please enter the second number");
        double num2= input.nextDouble();


        if (operator=='+'){
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        } else if (operator=='-') {
            System.out.println(num1+"-"+num2+"="+(num1-num2));
        } else if (operator=='*') {
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        } else if (operator=='/') {
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }
    }
}
