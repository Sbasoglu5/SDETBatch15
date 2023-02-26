package class28Homework;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 2; i <=500 ; i+=2) {
            evenNumbers.add(i);
        }
        evenNumbers.removeIf(x-> x%5==0);
        System.out.println(evenNumbers);
    }
}
