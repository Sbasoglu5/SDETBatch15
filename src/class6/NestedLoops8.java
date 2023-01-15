package class6;

public class NestedLoops8 {
    public static void main(String[] args) {

        /*for (int i=0; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j=0; j<=5;j++){
            System.out.print(j*2+" ");
        }
        System.out.println();
        for (int j=0; j<=5;j++) {
            System.out.print(j * 3 + " ");
        }*/

        for (int i = 1; i <=3 ; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println();
        }
    }
}