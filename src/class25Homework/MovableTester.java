package class25Homework;


public class MovableTester {
    public static void main(String[] args) {
        Movable[] movables = {new Car(),new Dog()};
        for (Movable m : movables) {
            m.move();

        }
        Ownable[] ownables={new Car(),new Dog()};
        for (Ownable o:ownables){
            o.own();
        }
    }
}
