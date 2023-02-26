package Replit;


import java.util.LinkedList;

public class Replit189 {
    public static void main(String[] args) {
        LinkedList <Integer> list=new LinkedList();
        for (int i = 51; i <100 ; i++) {
            list.add(i);
        }
        list.removeIf(i -> i%3!=0);
        System.out.println(list);
    }
}
