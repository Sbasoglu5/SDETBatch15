package class8Homework;

public class Task9 {
    public static void main(String[] args) {
        int[]numbers={10,20,56,4,78,958,14,70,3};
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }else if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
