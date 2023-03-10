package class26;

public interface TrustAble {
    int age=10;

    int trust();


    // other possibilities with interface, but we won't need that as a tester
    static void method1(){
        System.out.println("Hello world");
    }

    default void method2(){

    }
    private void method3(){

    } // other possibilities with interface, but we won't need that as a tester
}
class Bank implements TrustAble{
    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}
