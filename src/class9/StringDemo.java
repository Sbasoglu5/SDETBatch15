package class9;

public class StringDemo {
    public static void main(String[] args) {
        String strObj=new String("Java");
        String strObj2="java";

        System.out.println(strObj2.length());

        String name="Sezar Basoglu";
        if (name.length()>10){
            System.out.println("Name cannot be more than 10 letters");
        }
    }
}
