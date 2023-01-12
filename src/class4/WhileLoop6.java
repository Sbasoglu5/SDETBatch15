package class4;

public class WhileLoop6 {
    public static void main(String[] args) {
        int num=1;

        /*while (num<17){
            if (num!=5&&num!=10&&num!=15){
                System.out.println(num);
            }
            num++;
        }*/

        while (num<17){
            if (num%5!=0){
                System.out.println(num);
            }
        num++;
        }
    }
}
