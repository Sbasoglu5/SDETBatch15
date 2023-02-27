package class30Homework;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/

    public static void main(String[] args) {
        Collection<String> unique=new LinkedHashSet<>();
        unique.add("I");
        unique.add("can't");
        unique.add("wait");
        unique.add("to");
        unique.add("find");
        unique.add("a");
        unique.add("good");
        unique.add("job!");


        for (String strings: unique){
            System.out.print(strings+" ");
        }
    }
}
