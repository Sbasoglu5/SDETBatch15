package class15Homework;

public class Task3 {
    // Create a method that will print whether given String is palindrome or not.
    boolean pal(String word) {
        StringBuilder stringBuilder=new StringBuilder(word);
        if (word.equalsIgnoreCase(stringBuilder.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}
