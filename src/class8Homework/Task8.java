package class8Homework;

public class Task8 {
    public static void main(String[] args) {
        int number=15, number1=0,number2=1;
        System.out.println("Fibonacci series from  till " +number);

        for (int i = 1; i <number ; i++) {
            System.out.print(number1 + " ");
            int nextnumber = number1 + number2;
            number1 = number2;
            number2 = nextnumber;
        }
    }
}
