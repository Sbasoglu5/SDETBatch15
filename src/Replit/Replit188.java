package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int elements= scanner.nextInt();
            numbers.add(elements);
        }
        for (Integer i:numbers){
            System.out.print(i+" ");
        }


    }
}
