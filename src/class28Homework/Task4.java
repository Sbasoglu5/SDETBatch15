package class28Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Beer");
        drinks.add("Wine");
        drinks.add("Whiskey");
        drinks.add("Gin");
        drinks.add("Rum");


        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);


    }
}
