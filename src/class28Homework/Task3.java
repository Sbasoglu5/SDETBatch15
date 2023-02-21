package class28Homework;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {


        ArrayList<String> words=new ArrayList<>();
        words.add("Tom");
        words.add("Jerry");
        words.add("Mike");
        words.add("Richard");
        words.add("Dick");
        words.add("Luise");

        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }
}
