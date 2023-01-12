package class4;

public class WhileLoop3 {
    public static void main(String[] args) {
        int number=1;
        int sum=0;
        while (number<=10){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);
        /*
        num+sum=sum
        1+0=1
        2+1=3
        3+3=6
        4+6=10
        5+10=15
        6+15=21
        7+21=28
        8+28=36
        9+36=45
        10+45=55

         */
    }
}
