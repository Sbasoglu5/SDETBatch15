package class8Homework;

public class Task4 {
    public static void main(String[] args) {

        int [][] arr ={{3,4,7,8,15,12,46,79,78},{4,5,7,79,8,12,45,56}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
            }
            }
            System.out.println();
        }
    }
}
