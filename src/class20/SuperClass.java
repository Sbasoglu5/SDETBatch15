package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from a parent class");
    }
}
class SubClass extends SuperClass{

    SubClass(){
        super(); // actually behind the scene automatically
                //makes a call to the parent constructor
        System.out.println("I am a child constructor");
    }
}
