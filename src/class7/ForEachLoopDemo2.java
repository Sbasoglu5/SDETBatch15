package class7;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int [] arr1={10,13,20,25,45,50};

        /*arr1[1]=0;
        for (int j : arr1) {                    //for each loop
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }*/

        arr1[1]=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0){
                System.out.println(arr1[i]);
            }
        }
        int [] arr={10,13,20,25,45,50};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                arr[i]=0;
            }
        }

        System.out.println("*********");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
