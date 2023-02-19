package GroupProjectHomework;

public interface Shape {

    public void calculateArea();
}
class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("The are of a circle is 360 degrees");
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Square has 4 equal edges");
    }
}

