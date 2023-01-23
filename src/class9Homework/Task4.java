package class9Homework;

public class Task4 {
    public static void main(String[] args) {
        int sum=0;
        int [][] numbers={{33,55,7},{8,7,9},{7,8,5}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];

            }
        }
        System.out.println("Sum is "+sum);
    }
}
