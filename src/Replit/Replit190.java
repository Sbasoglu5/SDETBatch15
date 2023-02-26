package Replit;

import java.util.LinkedList;

public class Replit190 {
    //fibonacci series
    public static void main(String[] args) {
        LinkedList<Integer> f=new LinkedList<>();
        int num1=0, num2=1;
        for (int i = 0; i <=9; i++) {
            f.add(num1);
            int nextNum=num1+num2;
            num1=num2;
            num2=nextNum;

        }
        for (Integer i:f){
            System.out.print(i+" ");
        }



    }
}
