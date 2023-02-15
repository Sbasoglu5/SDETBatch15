package Replit;

import class6HomeWork.Replit;

public class Replit128 {
    static String mixString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            if (a < s2.length()) {
                sb.append(s2.charAt(a));
                a++;
            }
        }
        if (a < s2.length()) {
            sb.append(s1.substring(a));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Replit128 mix = new Replit128();
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }
}
