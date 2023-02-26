package Replit;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hi");
        names.add("yo");
        names.add("sup");
        names.add("yolo");
        names.add("boop");
        names.remove(4);
        names.remove(2);
        names.remove(0);
        for (String n:names){
            System.out.print(n+" ");
        }
    }

}
