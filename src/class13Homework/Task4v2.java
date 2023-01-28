package class13Homework;

public class Task4v2 {
    public static void main(String[] args) {
        String str="This is sentence I want to reverse";
        String [] arr =str.split(" ");
        for(String word:arr){
            for (int i = word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }


        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length()-1; j >=0 ; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
