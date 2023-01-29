package class15Homework;

public class Task3 {
    // Create a method that will print whether given String is palindrome or not.
   /* boolean pal(String word) {
        StringBuilder stringBuilder=new StringBuilder(word);
        if (word.equalsIgnoreCase(stringBuilder.reverse().toString())){
            return true;
        }else{
            return false;
        }*/

    void isPalindrome(String str) {
        StringBuilder st = new StringBuilder(str);
        if (st.reverse().toString().equals(st)) {
            System.out.println(st + " is a palindrome");
        } else {
            System.out.println(st + " is not a palindrome");
        }
    }
}
 /* String str="dad";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String reversed= str.toString();
        if (str.equals(reversed)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" not a palindrome");
        }*/