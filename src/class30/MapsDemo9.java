package class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {
         /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/

            Map<String,String> countries=new TreeMap<>();
            countries.put("USA","Washington DC");
            countries.put("Switzerland","Bern");
            countries.put("France","Paris");
            countries.put("England","London");
            countries.put("Canada","Toronto");

            var values=countries.values();
            for (var value:values){
                System.out.println(value);
            }
        System.out.println("_______________________________");

            Iterator iterator=countries.values().iterator();
            while (iterator.hasNext()){
                var entry=iterator.next();
                System.out.println(entry);
            }
    }
}
