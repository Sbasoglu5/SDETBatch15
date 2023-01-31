package class17Homework;

public class Task1 {/* Write a java class that will have a constructor:
   one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.*/
    String name;
    String id;
    int age;
    double weight;

    Task1(String name1, String id2, int age2, double weight2){
        name=name1;
        id=id2;
        age=age2;
        weight=weight2;
    }
    Task1(){

    }
    void print(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }
}
