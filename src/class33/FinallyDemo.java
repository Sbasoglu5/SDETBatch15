package class33;

import GroupProjectHomework.WebDriver;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("1");

        try{
            System.out.println("2");
           //System.out.println(10/0);
            String str=null;
            str.length();
            System.out.println("3");
        }catch(ArithmeticException ae){
            System.out.println("4");
            System.out.println(10/0);
            System.out.println("5");
        }finally{
            System.out.println("will always be executed");
        }
        System.out.println("6");
    }
}