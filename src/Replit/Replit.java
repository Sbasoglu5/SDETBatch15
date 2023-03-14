package Replit;

import java.util.Scanner;
import java.util.Stack;

public class Replit {
    public static String findLargest(String word) {

        String[] strArr = word.split(" ");
        String largest = "-1";
        for (String s : strArr) {
            if (s.length() % 2 == 0 && s.length() > largest.length()) {
                s = largest;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String [] arr={"find MaxLen Even","I am very Good at Java","I was"};
        for (String s : arr) {
            String result=findLargest(s);
            System.out.println(s);
        }
    }
}


