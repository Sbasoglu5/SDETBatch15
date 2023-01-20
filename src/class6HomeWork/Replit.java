package class6HomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[] elements = new int[5];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextInt();
            System.out.println(elements[i] * 10);

        }


    }
}