package class29Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Task2 {/*Create a Set of cities in which you want to make sure that insertion order is maintained.
                        Then remove any city that starts with “A”;*/

    public static void main(String[] args) {
        TreeSet<String> cities=new TreeSet<>();
        cities.add("Paris");
        cities.add("New York");
        cities.add("Athens");
        cities.add("Moscow");
        cities.add("Bologna");
        cities.add("Atlanta");
        cities.add("Geneva");
        cities.add("Alhambra");

        cities.removeIf(i->i.toLowerCase().startsWith("a"));
        System.out.println(cities);




    }
}
