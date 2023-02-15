package class24;

public abstract class Animal {
  abstract void speak();
  void sleep(){
      System.out.println("Animals sleep 5 to 8 hours a day");
  }
}

class Dog extends Animal{

    @Override
    void speak() {
        System.out.println("wuff wuff");
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 12 hours");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow TANGY meow");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep 15 hours, Tangy does 18");
    }
}
