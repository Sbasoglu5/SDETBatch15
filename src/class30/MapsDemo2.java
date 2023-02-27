package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {
        Map<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);
        //System.out.println(fruit);
        //fruit.put(null,null);
       // System.out.println(fruit);

        HashMap<String,Double> makeUp=new HashMap<>();
        makeUp.put("Lipstick",50.0);
        makeUp.put("Foundation",40.0);
        makeUp.put("Mascara",70.0);
        makeUp.put("Eyeliner",12.2);
        makeUp.put("Blush-on",12.2);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(makeUp);
        groceries.putAll(fruit);
        System.out.println(groceries);
    }
}
