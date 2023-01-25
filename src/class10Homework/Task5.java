package class10Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String str=input.next();
        String reverse="";

        for (int i =str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        if (reverse.equals(str)){
            System.out.println(reverse+" is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
