package class9Homework2;

public class Task2 {
    public static void main(String[] args) {


        String firstStr="Sunday";
        for (int i = 5; i >=0; i--) {
            System.out.print(firstStr.charAt(i));
        }
        System.out.println();

        String str="Sunday";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }



    }
}
