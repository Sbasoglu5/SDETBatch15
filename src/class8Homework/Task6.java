package class8Homework;

public class Task6 {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("Before swap");
        System.out.println("First value :"+a);
        System.out.println("Second value :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println("First value: "+a);
        System.out.println("Second value: "+b);


    }
}
