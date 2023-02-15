package ReviewClass7;

public class minimumArray {
   int minimum(int [] arr){
       int min=arr[0];//if it's an array you can't write it just 0;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]<i){
               arr[i]=min;
               min++;
           }

       }
       return min;
   }

    public static void main(String[] args) {
       int [] array={5,7, 88, 99, 44};
        minimumArray m=new minimumArray();
        System.out.println(m.minimum(array));
    }
}
