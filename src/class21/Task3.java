package class21;

public class Task3 {
    private void A(int a, int b, int c){
        System.out.println(a*b*c);
    }
    private void A(int a, int b){
        System.out.println(a+b);
    }
    private void A(double a, int b, int c, int d){
        System.out.println(a*b*c*d);
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.A(5,7,9);
    }
}
