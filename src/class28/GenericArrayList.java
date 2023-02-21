package class28;

import class21.Animal;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>(); // GENERIC ArrayList one data type at the time written in <>
        names.add("10");


        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

       /* ArrayList name = new ArrayList(); //called NON-GENERIC ArrayList when you don't specify the data type in <>
        name.add("Zafar");
        name.add(10);
        name.add('a');

        for (Object j:name) {
            ((String) j).trim();
        }*/
    }

}
