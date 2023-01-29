package class16Homework;

public class Task2 {
    /*Create a method that will take a String as a parameter
     and returns reversed String.
     Method should be available to all classes within your project
     and accessible by class name.*/
    public String task2(String a){
        StringBuilder stringBuilder=new StringBuilder(a);
        return stringBuilder.reverse().toString();
    }

}
