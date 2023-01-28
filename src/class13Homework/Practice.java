package class13Homework;

public class Practice {
    public static void main(String[] args) {
        String word="This";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word);//ThisThisThisThis
            System.out.print(i);//3210
            System.out.print(word.charAt(i));//sihT
        }

    }
}
