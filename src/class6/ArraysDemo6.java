package class6;

public class ArraysDemo6 {
    public static void main(String[] args) {
        int sum=0;
        int[]numbers=new int[5];
         numbers[0]=45;// numbers are picked from parenthesis bc we asked from indexes i reads the parenthesis
         numbers[1]=44;
         numbers[2]=33;
         numbers[3]=20;
         numbers[4]=10;

        for (int i = 0; i < numbers.length; i++) {
            if (i%2==0){
                sum=sum+numbers[i];

            }
        }
        System.out.println("even "+sum);



    }
}
