package class17Homework;

public class Students {
   /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
   Inside your class also have a method to Calculate Average Grade.
   Test Student class for 5 different students with different marks.
   Your program should print an average mark of each student's name.
   NOTE: please use different names for instance and local variables.*/

    String name;
    int math;
    int literature;
    int sience;

    Students(String name2,int math2,int literature2,int sience2){
        name=name2;
        math=math2;
        literature=literature2;
        sience=sience2;
    }
    void print(){
        int average=(math+literature+sience)/3;
        System.out.println(name+"'s average score is "+average);
    }

}
