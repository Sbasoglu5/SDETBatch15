package class8Homework;

public class Task10 {
    public static void main(String[] args) {


        int[] arr = {7, 45, 36, 57, 83, 45, 56, 29, 16, 3, 47, 2, 7, 12};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }



        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < largest && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }

        System.out.println("The second largest value is " + secondLargest);
    }
}
