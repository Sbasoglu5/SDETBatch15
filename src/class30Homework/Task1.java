package class30Homework;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    /* Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.*/

    public static void main(String[] args) {
        Map<Integer, String > bestBuyStore=new HashMap<>();
        bestBuyStore.put(400,"Printer");
        bestBuyStore.put(1200,"Laptop");
        bestBuyStore.put(2200,"TV");
        bestBuyStore.put(125,"HardDisk");
        bestBuyStore.put(255,"Headphones");
        bestBuyStore.put(1850,"Computer");

        //Set<Map.Entry<Integer,String>> entrySet=bestBuyStore.entrySet();
        var entrySet=bestBuyStore.entrySet();
        for (var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
