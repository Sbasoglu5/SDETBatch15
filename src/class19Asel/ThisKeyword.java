package class19Asel;

public class ThisKeyword {
    int a,b;

    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;
    }

    public void sum(int a, int b){
        System.out.println("Sum of local variables ="+a+b);
        System.out.println("Sum of instance variables ="+this.a+this.b);
        System.out.println("Sum of instance variables ="+(this.a+this.b));
    }

    public static void main(String[] args) {


        ThisKeyword kw=new ThisKeyword(10,20);
        System.out.println(kw.a);

        kw.sum(100,200);
    }
}
