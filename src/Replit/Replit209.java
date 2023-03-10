package Replit;

import java.util.*;

public class Replit209 {
    public static void main(String[] args) {
        List<Map<String ,Object>> dataList=new ArrayList<>();
        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10);
        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10);
        dataList.add(orangeMap);

        double total=0.0;
        for (var d:dataList){
            String items = (String) d.get("Items");
            double price = (double) d.get("Price");
            double quantity = ((Number) d.get("Quantity")).doubleValue();
            double subTotal = price * quantity;

            System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subTotal);
            System.out.println();

            total += subTotal;
        }
        System.out.println("Your Purchase total : " + total);
    }
}
