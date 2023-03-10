package class8Homework;

public class Task5Important {
    public static void main(String[] args) {
        int [][] numbers={{5,8,9,12},{7,98,23,44,57}};

        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                } else{
                    sumOdd=sumOdd+numbers[i][j];
                }
            }

        }
        System.out.println(sumOdd);
        System.out.println(sumEven);

    }
}
