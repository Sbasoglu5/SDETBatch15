package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }
    void eat(){
        System.out.println("All animals eat");
    }

}
class Cat extends Animal{
    //This is how we override the method from cat class
    void speak(){
        super.speak();//without super we wouldn't see what was written in the parent class
        System.out.println("Meow Meow ..........");
    }

}

class Dog extends Animal{

}
class Tester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}
