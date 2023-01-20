package class8Homework;

public class Task3 {
    public static void main(String[] args) {
        int [][] arr= {{5,7,9},{10,11,12},{20,26,8}};

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }

        }

        System.out.println(sum);
    }
}
