package class9Homework;

public class DogTester {
    public static void main(String[] args) {
        Dog husky=new Dog();
        husky.breed="Husky";
        husky.color="White";
        husky.age=2;
        husky.sex='F';
        husky.size="Medium";

        husky.featureHusky();
        husky.eat();
        husky.sleepH();

        Dog bulldog=new Dog();
        bulldog.breed="Bulldog";
        bulldog.color="Black";
        bulldog.age=3;
        bulldog.sex='M';
        bulldog.size="Huge";

        bulldog.featureBulldog();
        bulldog.eat();
        bulldog.sleepB();

        Dog labrador=new Dog();
        labrador.breed="Labrador";
        labrador.color="Black";
        labrador.age=1;
        labrador.sex='F';
        labrador.size="Large";

        labrador.featureLabrador();
        labrador.eat();
        labrador.sleepL();
    }
}
