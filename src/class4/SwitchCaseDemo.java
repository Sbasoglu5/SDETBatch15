package class4;

import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter a country");
        String country=input.nextLine();
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pizza");
                break;
            case "france":
                System.out.println("Beouf bourgogne");
                break;
            case "england":
                System.out.println("Beef wellington");
                break;
            default:
                System.out.println("Wrong country");
        }*/

        Scanner input=new Scanner(System.in);
        System.out.println("Enter tree numbers");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3= input.nextInt();

        if (number1>number2&&number1>number3){
            System.out.println("The largest number is " + number1);
        }else if (number2>number1&&number2>number3){
            System.out.println("The largest number is "+number2);
        }else if (number3>number1&&number3>number2){
            System.out.println("the largest number is "+number3);
        }


        input.close();
        
    }
}
