package class30;

import class28Homework.Insurance;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo3 {
    /*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/
    public static void main(String[] args) {
        Map<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(1,"Syntax");
        building.put(2,"Samsung");
        building.put(3,"Microsoft");
        building.put(4,"Google");
        building.put(5,"Apple");
        building.put(5,"Microsoft");
        building.put(6,"Walmart");
        building.put(7,"Asus");

        System.out.println(building.size());
        building.replace(4,"Chrome");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
