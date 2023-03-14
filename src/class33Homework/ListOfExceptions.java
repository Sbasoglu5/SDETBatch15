package class33Homework;

import java.util.ArrayList;
import java.util.List;

public class ListOfExceptions {
    public static List<Exception> exceptionList(){
        List<Exception> exceptions=new ArrayList<>();
        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException n){
            System.out.println(n);
            exceptions.add(n);
        }
        try {
            int a=0; int b=5;
            int c=b/a;
            System.out.println(c);
        }catch (ArithmeticException a){
            System.out.println(a);
            exceptions.add(a);
        }
        try{
            int [] arr=new int[3];
            arr[5]=100;
        }catch (ArrayIndexOutOfBoundsException arr){
            System.out.println(arr);
            exceptions.add(arr);
        }
        try{
           String name="Syntax";
            System.out.println(name.charAt(9));
        }catch (IndexOutOfBoundsException i){
            System.out.println(i);
            exceptions.add(i);
        }
        return exceptions;

    }

    public static void main(String[] args) {
        exceptionList();
    }
}
