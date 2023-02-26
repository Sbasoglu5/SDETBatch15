package Replit;

public class Replit177 {
}
interface Outputs{
    void display(double result);
}
interface Functions extends Outputs{
    @Override
    void display(double result);
    double labelAdding(double firstNumber, double secondNumber);
    double labelSubtracting(double firstNumber, double secondNumber);
    double labelMultiply(double firstNumber, double secondNumber);
    double labelDividing(double firstNumber, double secondNumber);
}
class Main implements Functions{
    double firstNumber=100.00;
    double secondNumber=20.00;

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+result);
    }

    @Override
    public double labelAdding(double firstNumber, double secondNumber) {

        return firstNumber+secondNumber;
    }

    @Override
    public double labelSubtracting(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double labelMultiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double labelDividing(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.display(main.labelAdding(main.firstNumber, main.secondNumber));
        main.display(main.labelSubtracting(main.firstNumber, main.secondNumber));
        main.display(main.labelMultiply(main.firstNumber, main.secondNumber));
        main.display(main.labelDividing(main.firstNumber, main.secondNumber));

    }
}
