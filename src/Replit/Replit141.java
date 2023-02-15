package Replit;


public class Replit141 {
   int maxValue(int [] array){
        int max=array[0];
        for (int newArray : array) {
            if (newArray > max) {
                max = newArray;
            }
        }
        return max;
        }

    public static void main(String[] args) {
       Replit141 obj=new Replit141();
        int [] arr={5,12,-3,7,3,22};
        System.out.println(obj.maxValue(arr));

    }
}
