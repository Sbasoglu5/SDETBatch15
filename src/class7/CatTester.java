package class7;

public class CatTester {
    public static void main(String[] args) {
        //creating an object from the Cat class
        Cat cat1=new Cat();

        cat1.name="Tangy";
        cat1.breed="Short hair";
        cat1.age=2;
        cat1.color="Ginger";
        System.out.println(cat1.name);
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Whitney";
        cat2.breed="Short hair";
        cat2.color="Black and white";
        cat2.age=5;

        cat2.speak();




    }
}
