package class9Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter=input.next();

       if (!letter.isEmpty()){
           if (letter.length()>3&&letter.length()%2!=0){
               char [] c=letter.toCharArray();
               int middle=c.length/2;
               System.out.println("The middle character is "+c[middle]);
           }else{
               System.out.println("Invalid");
           }
       }

       String str="Sezar";
       if (!str.isEmpty()){
           char c=str.charAt(2);
           System.out.println(c);
       }
    }
}
