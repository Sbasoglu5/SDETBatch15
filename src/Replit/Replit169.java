package Replit;

public class Replit169 {
    public static void main(String[] args) {
        Constant c=new Constant();
        int[] a = {2,7,3,8,4};
        System.out.println(c.avgElements(a)); //should print 4.8
    }
}
class Constant{
    final double avgElements(int [] arr){
        double sum=0;
        for(double avr:arr){
            sum+=avr;
        }
        return sum/arr.length;
    }
}
