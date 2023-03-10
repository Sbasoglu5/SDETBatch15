package Replit;

import java.util.HashMap;
import java.util.Map;

public class Replit208 {
    public static void main(String[] args) {
        Map<String, Integer> values = new HashMap<>();

        values.put("mango", 10);
        values.put("apple", 30);
        values.put("orange", 20);

        display(values);
        values.clear();
        display(values);
    }
    public static void display(Map<String, Integer> map) {

        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
