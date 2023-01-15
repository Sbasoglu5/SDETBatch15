package class6;

public class ArraysDemo8 {
    public static void main(String[] args) {
        int count=0;
       double[]arr={10.5,12.0,45,10.5,23,10.5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==10.5) {
                count++;
            }
        }
        System.out.println("10.5 has been presented "+count);
    }
}
