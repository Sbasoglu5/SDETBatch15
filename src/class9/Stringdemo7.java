package class9;

public class Stringdemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean starsWith=str.startsWith("I");
        System.out.println(starsWith);
        System.out.println(str.endsWith("java"));


        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));
    }
}
