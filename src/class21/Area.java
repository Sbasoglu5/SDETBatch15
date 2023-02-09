package class21;

public class Area {

    void calculate(double length,double width){
        System.out.println("The are of a triangle is "+length*width);
    }
    void calculate(double s){
        System.out.println("The are of a square is "+s*s);
    }

    public static void main(String[] args) {
        Area area=new Area();
        area.calculate(5,8);
    }
}
