package class20;

public class BaseClass {
    String name="John";
    void hello(){
        System.out.println("Hello from base class");
    }
}
class Child extends BaseClass{
    String name="Jane";
    void print(){
        System.out.println(name);//Jane
        System.out.println(super.name);//John
    }
    void hello(){
        System.out.println("Hello from child");
    }
    void parentMethod(){
        hello();//no super executes same class' hello
        super.hello();
    }
}
