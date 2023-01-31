package class17Homework;

public class Student {
    /*Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given student using displayInfo method.*/

    String name;
    String address;

    Student(String name2,String address2){
        name=name2;
        address=address2;
    }
    void print(){
        System.out.println("Name: "+name+" Address: "+address);
    }
}
