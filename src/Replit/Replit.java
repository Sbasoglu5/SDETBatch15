package Replit;

public class Replit {
    public static void main(String[] args) {
        Tea [] teas={new LemonTea("Lemon Tea"),new ChaiTea("Chai Tea")};
        for (Tea t:teas){
            t.addSugar();
        }

    }
}
abstract class Tea {
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();

}
class LemonTea extends Tea{

    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoons of sugar");
    }
}
