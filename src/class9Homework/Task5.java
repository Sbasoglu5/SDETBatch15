package class9Homework;

public class Task5 {
    public static void main(String[] args) {


        int [][] numbers={{10,11,55,57},{72,138,45,78},{4,23,2,70}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
        System.out.println();

        System.out.println("_________________");

        for (int[]num : numbers){
            for (int s : num){
                if (s%2==0){
                    System.out.print(s+" ");
                }

            }

        }
    }
}
