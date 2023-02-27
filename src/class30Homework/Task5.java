package class30Homework;

import java.util.ArrayList;
import java.util.Collection;

public class Task5 {
    /*Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(75);
        numbers.add(-55);
        numbers.add(15);
        numbers.add(65);
        numbers.add(35);
        numbers.add(45);
        numbers.add(5);

        int sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
