package ReviewClass10Asghar;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);

        var entrySet=fruitMap.entrySet();
        for (var entry: entrySet) {
            if ((entry.getKey().contains("e")||entry.getKey().contains("a"))&&entry.getValue()>8){
                System.out.println(entry.getKey()+" "+entry.getValue());

            }
        }
        System.out.println((2+2)*2);// simply parenthesis gives the operation priority
    }
}
