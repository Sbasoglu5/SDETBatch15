package class6HomeWork;

public class TaskArray5 {
    public static void main(String[] args) {
        int [] numbers={5,8,15,20,78};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
