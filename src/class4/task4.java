package class4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.next();


        if (month.equalsIgnoreCase("december")||month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")){
            System.out.println("Winter");
        } else if (month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("may")) {
            System.out.println("Spring");
        } else if (month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")) {
            System.out.println("Summer");
        } else if (month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")) {
            System.out.println("Winter");
        }else {
            System.out.println("Invalid month");
        }
        System.out.println("You were born in "+month);
    }
}
