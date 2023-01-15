package class6;

public class ArraysDemo2 {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 45, 50};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];

        }
        System.out.println(total);
    }
}