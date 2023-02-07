package class20Homework;

public class AreaOfACircle {
    double radius;

    AreaOfACircle(double radius){
        this.radius=radius;
    }
}
class Circle extends AreaOfACircle {
    double pi=3.14159265359;

    Circle(double radius){
        super(radius);

    }

    void calculate(){
        System.out.println("Area of the circle is ~= "+(Math.round(pi*radius*radius)));
    }
}
