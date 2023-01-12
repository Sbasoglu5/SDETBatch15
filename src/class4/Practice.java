package class4;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1= input.nextDouble();
        System.out.println("Please enter an operator");
        char operator=input.next().charAt(0);
        System.out.println("Please enter another number");
        double num2= input.nextDouble();

       /*if (operator=='+') {
           System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
       } else if (operator=='-') {
           System.out.println(num1+"-"+num2+"="+(num1-num2));
       } else if (operator=='*') {
           System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
       }else if (operator=='/'){
           System.out.println(num1+"/"+num2+"="+(num1/num2));*/

        switch (operator){
            case '+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case '-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
       }
    }
}
