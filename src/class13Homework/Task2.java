package class13Homework;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String password="QwErTy1234@#$%^&";


        int count=0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                count++;
            }

        }
        System.out.println(count);

        String str="jnfjdnJNJFD87687&*(()";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
