package class25Homework;


public class MovableTester {
    public static void main(String[] args) {
        Movable[] movables = {new Car(),new Dog()};
        for (Movable m : movables) {
            m.move();

        }
        Ownable[] ownAbles={new Car(),new Dog()};
        for (Ownable o:ownAbles){
            o.own();

        }
    }
}
