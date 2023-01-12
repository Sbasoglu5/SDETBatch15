package class4;

public class WhileHoop4 {
    public static void main(String[] args) {
       /* int num=1;
        boolean flag=true;
        while(flag){
            System.out.println(num);
            if (num>3){
                flag=false;

            }
            num++;
        }*/

        boolean condition = true;
        int num = 0;
        while (condition) {
            System.out.println("Hello");
            if (num > 3) {
                condition = false;
            }
            num++;
        }
    }
}