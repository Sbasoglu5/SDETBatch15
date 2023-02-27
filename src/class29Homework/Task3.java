package class29Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task3 {/*Create a Set collection that will hold Objects of Student Type.
                    In this set we do not care about the insertion order.
                    Each student object should have name and studentID.
                    Display name of each student.*/

    public static void main(String[] args) {
        Set<Student> students=new HashSet<>();//we can achieve polymorphism
        students.add(new Student("Jennifer",123456));
        students.add(new Student("Tom",123567));
        students.add(new Student("John",123789));
        students.add(new Student("Katy",123123));
        students.add(new Student("Sabrina",123545));
        //Display the name of each student
        for (Student s:students){
            System.out.println(s.getName()+" "+s.getStudentID());
        }

    }
}
class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName(){
        return name;
    }

    public int getStudentID(){
        return studentID;
    }
}
