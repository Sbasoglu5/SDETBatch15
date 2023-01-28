package class14;

public class Math {
    //create a method that takes 2 int numbers add them
    // show the result on the console
    void add(int a,int b){
        System.out.println(a+b);
    }
    //create a method t hat takes 3 int numbers multiply them
    // show the result on the console
    void mul(int num,int num2,int num3){
        System.out.println(num*num2*num3);
    }

    int sub(int num1,int num2){
        //it tells java whenever this method is called what value to return
        return num1-num2;
    }
}
