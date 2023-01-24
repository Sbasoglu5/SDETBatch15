package class9Homework2;

public class Task2 {
    public static void main(String[] args) {
        String str="Sunday";
        String reverse="";

        for (int i = 0; i < str.length(); i++) {
            reverse=str.charAt(i)+reverse;
        }
        System.out.println(reverse);


    }
}
