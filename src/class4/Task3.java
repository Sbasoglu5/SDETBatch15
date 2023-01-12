package class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz, midterm and final scores");
        double quiz= input.nextDouble();
        double midTerm=input.nextDouble();
        double finalScore=input.nextDouble();
        double average=(quiz+midTerm+finalScore)/3;

        if (average>=90&&average<=100){
            System.out.println("Grade=A");
        } else if (average<90&&average>=70) {
            System.out.println("Grade=B");
        } else if (average<70&&average>=50) {
            System.out.println("Grade=C");
        }else if (average<50){
            System.out.println("Grade=F");
        }


    }
}
