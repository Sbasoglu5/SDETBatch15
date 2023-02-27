package class30Homework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PersonTest {
    public static void main(String[] args) {
        Map<Integer,Person> people=new TreeMap<>();
        people.put(123,new Person("Tom","Hanks",27,62000.0));
        people.put(124,new Person("Katy","Parsey",25,67000.0));
        people.put(125,new Person("Jennifer","Hanson",32,72500.0));
        people.put(126,new Person("Emma","Walter",22,68000.0));
        people.put(127,new Person("John","Terry",36,70000.0));

        var entrySet=people.entrySet();
        for (var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
