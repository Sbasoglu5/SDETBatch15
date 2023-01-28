package ReviewClass2;

public class Array2D {
    public static void main(String[] args) {
        int [][] array={{1,2,3},
                        {11,12,13},
                        {20,21,22},
                        {100,101}};

        //The version of enhanced loop
        for (int [] arr:array) { //iterates over arrays (rows (cabins))

            for (int num:arr) { //iterates over each element (columns (seats))
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        System.out.println("********************************");

        // The version of for loops
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column]%2==0){
                    System.out.print(array[row][column]+" ");
                }
            }
            System.out.println();
        }
    }
}
