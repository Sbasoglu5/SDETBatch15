package class10;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write java a lot of code daily. I am from batch 15.";
        String[] strArr= str.split("[.,?,!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0].trim());
    }
}
