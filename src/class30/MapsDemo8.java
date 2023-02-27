package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo8 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {

        Map<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Switzerland","Bern");
        countries.put("France","Paris");
        countries.put("England","London");
        countries.put("Canada","Toronto");

        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        var entrySet=countries.entrySet();

        //for (Map.Entry<String,String> entry:entrySet){
        for (var entry:entrySet){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        System.out.println("______________________________________");
        var iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
