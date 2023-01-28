package class13Homework;

public class Task1 {
    public static void main(String[] args) {
        // Create a String that will hold a sentence.
        // Write a program to get a new String without any spaces.
        String str="Java is difficult. I have to study hard.";
        System.out.println(str.replaceAll("[^A-Za-z.]",""));

        String str2="Java is great";
        String newStr=str2.replaceAll(" ","");
        System.out.println(newStr);
    }
}
