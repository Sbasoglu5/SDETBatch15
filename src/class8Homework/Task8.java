package class8Homework;

public class Task8 {
    public static void main(String[] args) {
        int number=5, number1=0,number2=1;
        System.out.println("Fibonacci series from  till " +number);

        for (int i = 1; i <number ; i++) {

            int nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
        }
        System.out.print(number1 + " ");
    }
}
