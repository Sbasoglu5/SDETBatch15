package Replit;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB=new ArrayList<>(listA);

        Iterator<Boolean> iterator=listB.iterator();
        while (iterator.hasNext()){
            Boolean b=iterator.next();
            System.out.println(b);
        }

    }
}
