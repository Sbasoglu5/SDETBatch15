package class2;

import java.util.Scanner;

public class Task5Temperature {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your city?");
        String city= scan.nextLine();

        System.out.println("What is temperature of your city?");
        int temperature= scan.nextInt(); //I didn't want the result as decimal.

        System.out.println("The temperature in "+city+" is "+((temperature-32)*5)/9);


    }
}
