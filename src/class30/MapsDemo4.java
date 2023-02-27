package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeUp=new HashMap<>();
        makeUp.put("Lipstick",50.0);
        makeUp.put("Foundation",40.0);
        makeUp.put("Mascara",70.0);
        makeUp.put("Eyeliner",12.2);
        makeUp.put("Blush-on",12.2);

        //To get only all keys we can use keySet method from Map Interface
        Set<String> allKeys=makeUp.keySet();
        System.out.println(allKeys);

        /*for (String s:allKeys){
            System.out.print(s+" ");
        }*/

        //Delete all the entries from the map for which the size of key is greater than 7
        allKeys.removeIf(i->i.length()>7);
        System.out.println(allKeys);
        System.out.println(makeUp);
    }
}
