package class3;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter gender");
        char gender=input.next().charAt(0);

        switch (gender){
            case'F':
                System.out.println("Female");
            break;
            case'M':
            case'm':
                System.out.println("Male");
            break;
            default:
                System.out.println("Not specified");

        }
    }
}
