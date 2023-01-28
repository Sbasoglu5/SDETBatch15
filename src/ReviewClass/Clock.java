package ReviewClass;


public class Clock {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l < 10; l++) {
                        if (i == 2 && j > 3) {
                            break;
                        }
                        System.out.println(i + "" + j + ":" + k + l);
                    }
                }

            }
        }
       /* int[][] matrix = {{10, 20, 30},
                {40, 50, 60, 70},
                {80, 90, 100, 110, 550}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println(matrix[0].length);*/


    }
}

