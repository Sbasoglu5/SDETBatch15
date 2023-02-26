package Replit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Replit {
    public static void main(String[] args) {
        List<String> countries=new ArrayList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        countries.removeIf(i->i.startsWith("A"));

        List<String> newList=new LinkedList<>();
        newList.addAll(countries);
        System.out.println(newList);
    }
}
