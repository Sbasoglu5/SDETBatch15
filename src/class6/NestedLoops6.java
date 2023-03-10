package class6;

public class NestedLoops6 {
    public static void main(String[] args) {
        /*for (int i = 0; i <3 ; i++) {
            for (int j = 1; j <6 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }*/
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 6; j++) {
                if (i == 1 && j == 2 || i == 1 && j == 3 || i == 1 && j == 4||i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4) {
                    System.out.print("  ");
                } else {
                    System.out.print(j + " "); //System.out.print(" *"); if you want only stars

                }
            }
            System.out.println();
        }
    }
}
