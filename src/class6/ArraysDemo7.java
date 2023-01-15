package class6;

public class ArraysDemo7 {
    public static void main(String[] args) {
       int [] numbers={10,20,30,4,5,6,7,80};
       int sum=0;    //Picks the even numbers here bc numbers are given as it is


        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i]%2==0){
               sum=sum+numbers[i];
           }
        }
        System.out.println("The elements which are multiplied by 2 "+sum);;
    }
}
