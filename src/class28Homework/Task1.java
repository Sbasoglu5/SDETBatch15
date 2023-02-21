package class28Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Mike");
        names.add("Richard");
        names.add("Dick");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Tom"));
        System.out.println(names.size());

    }
}
