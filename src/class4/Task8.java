package class4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        switch (grade){
            case 'A':
            case 'a':
                System.out.println(grade+" is an excellent grade");
                break;
            case 'B':
            case 'b':
                System.out.println(grade+" is a good grade");
                break;
            case 'C':
            case 'c':
                System.out.println(grade+" is an average grade");
                break;
            case 'D':
            case 'd':
                System.out.println(grade+" is a bad grade");
                break;
            default:
                System.out.println("Invalid grade");
            }

        }

    }

