package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {

        //remove all the keys from above map if they are greater than 2


        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Aisha");
        studentsMap.put(6,"Aisha");
        studentsMap.put(7,"Aisha");

        Set<Integer> allKeys=studentsMap.keySet();
        allKeys.removeIf(i -> i>2);
        System.out.println(allKeys);
        System.out.println(studentsMap);

    }
}
