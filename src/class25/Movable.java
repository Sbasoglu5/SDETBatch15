package class25;

public interface Movable {
    void move();
}
interface Ownable{
    void own();
    }

class Car implements Movable,Ownable{

    @Override
    public void move() {
        System.out.println("I can move");
    }
    public void own(){
        System.out.println("You can own me");
    }
}
class Dog implements Movable,Ownable{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}
