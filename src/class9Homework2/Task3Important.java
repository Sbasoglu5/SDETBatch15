package class9Homework2;

import java.util.Scanner;

public class Task3Important {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What do you expect: a boy or a girl");
        String expect=input.next();
        System.out.println("Mother to be's first name:");
        String mom=input.next();
        System.out.println("Father to be's first name:");
        String dad=input.next();
        String firstHalf="";
        String secondHalf="";

        if (expect.equalsIgnoreCase("girl")){
            firstHalf=mom.substring(0,mom.length()/2);
            secondHalf=dad.substring(dad.length()/2);

        }else {
            firstHalf=dad.substring(0, dad.length()/2);
            secondHalf=mom.substring(mom.length()/2);

        }
        System.out.println("The suggested name is "+firstHalf+secondHalf);
    }
}
