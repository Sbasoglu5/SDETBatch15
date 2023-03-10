package ReviewClass10Asghar;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo2 {
    public static void main(String[] args) {
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Soap",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon Fruit",5.6);
        fruitMap.put("pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
        //fruitMap.forEach((key,value)-> System.out.println(key+"  "+value)); it is like forEach loop faster

      fruitMap.entrySet().removeIf(i->(i.getKey().contains("a")||i.getKey().contains("e"))&&i.getValue()>8);
        System.out.println(fruitMap);
    }
}
