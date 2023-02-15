package class23Homework;

public class ComputerTester {
    public static void main(String[] args) {

        Computer [] array={new Apple(8,2023,"Machintosh",1300),new Lenovo(8,2023,"Windows",1000),new HP(8,2023,"Windows",900),new Dell(8,2023,"Windows",850)};
        for (Computer a:array){
            a.price();
            a.feature();
            a.opt();

            if (a instanceof Apple){
                Apple apple=(Apple)a;
                apple.price();
                apple.feature();
                apple.sss();
                apple.aaa();
            }
        }
    }
}
