package class7;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];

        // Below codes take the numbers from user and store them in the array its good but lots of codes
        /*numbers [0]=input.nextInt();
        numbers [1]=input.nextInt();
        numbers [2]=input.nextInt();
        numbers [3]=input.nextInt();
        numbers [4]=input.nextInt();*/

      /*  numbers [0]=5;
        numbers [1]=15;
        numbers [2]=25;
        numbers [3]=35;
        numbers [4]=45;*/


        //below code uses a normal forr loop to ask the user fo numbers and store them in array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        }
    }

