package Replit;

public class Replit135 {
    static String surround (String s,String searchTerm){
        return s.replaceAll(searchTerm,"("+searchTerm+")");
    }
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); //"techn(o)l(o)gy"
    }
}
