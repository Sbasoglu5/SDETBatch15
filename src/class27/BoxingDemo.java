package class27;

public class BoxingDemo {
    public static void main(String[] args) {

        int number=15;
        printData(number);

        Integer f=10;// autoboxing like type casting
        int number2=f;//auto unboxing

    }

    public static void printData(Integer number){
        System.out.println(number);
    }
}
