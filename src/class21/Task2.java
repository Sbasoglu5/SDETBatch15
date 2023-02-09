package class21;

public class Task2 {
    /*Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.*/
    static void A(int a, int b, int c){
        System.out.println(a*b*c);
    }
    static void A(int a, int b){
        System.out.println(a+b);
    }
    static void A(double a, int b, int c, int d){
        System.out.println(a*b*c*d);
    }

    public static void main(String[] args) {
        A(5,7,9);
    }
}

