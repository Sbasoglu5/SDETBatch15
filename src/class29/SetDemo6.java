package class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SetDemo6 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");


        TreeSet<String> hList=new TreeSet<>(aList);
        System.out.println(hList);

        for (String s:hList){
            System.out.println(s);
        }
        System.out.println("__________________");
        Iterator<String> iterator= hList.iterator();
        while(iterator.hasNext()){
            String s= iterator.next();
            System.out.print(s+" ");
        }
    }
}
