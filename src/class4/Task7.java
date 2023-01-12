package class4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=input.next();

        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Your official language is English");
                break;
            case "italy":
                System.out.println("Your official language is Italian");
                break;
            case "russia":
                System.out.println("Your official language is Russian");
                break;
            case "switzerland":
                System.out.println("Your official languages are Swiss German, French, Italian and Romansh");
                break;
            default:
                System.out.println("Please enter a default country");
        }

    }
}
