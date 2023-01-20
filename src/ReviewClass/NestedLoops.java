package ReviewClass;

public class NestedLoops {
    public static void main(String[] args) {
      /*  for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("***********");

        for (int i = 1; i < 5; i++) {
            System.out.println("Hello");

            for (int j = 1; j <=2 ; j++) {
                System.out.println("bye");
            }

        }*/

       /* for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }*/

       /* for (int i = 0; i <=9; i++) {
            for (int j = 0; j <=9; j++) {
                for (int k = 0; k <=9; k++) {
                    for (int l = 0; l <=9; l++) {
                        System.out.println(i+" "+j+" "+k+" "+l);
                    }
                }

            }

        }*/
/*
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j <60 ; j++) {
                System.out.println(i+" : "+j);
            }
        }*/

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (j>=2){
                    continue;
                }
                System.out.println("Hello");
            }
            System.out.println("Bye");

        }
    }
}
