package class6HomeWork;

public class Replit2 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            for (int j = i+1; j <=8; j++) {
                System.out.print((j-i)+" ");

            }
            System.out.println();
        }
        for (int i =2; i <=7 ; i++) {
             for (int j =i-1; j >=0 ; j--) {
                 System.out.print(((j-i)*-1) + " ");
             }
            System.out.println();
        }

    }
}
