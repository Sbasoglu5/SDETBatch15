package class15;

public class MethodPractice {
    //Create a method which returns true or false takes the int numbers as a parameter
    // if number is true or else false

    boolean isEven(int number){
        boolean flag;
        if (number%2==0){
            flag=true;
        }else{
            flag=false;
        }
        return flag;

}
    boolean isEven1(int number,int number1, int number2) {

        if (number % 2 == 0||number1%2==0||number2%2==0) {
            return true;
        } else {
            return false;
        }

    }

    boolean isEven2(int number,int number1, int number2){
        return number%2==0||number1%2==0||number2%2==0;
    }
}