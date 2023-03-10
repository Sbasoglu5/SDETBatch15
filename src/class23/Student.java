package class23;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism*/
    String schoolName;
    String schoolLocation;
    Student(String schoolLocation){
        this.schoolLocation=schoolLocation;

    }
    public void a(){
        System.out.println("ALL STUDENTS STUDY HARD");
    }
    public void b(){
    }
}
class SyntaxStudent extends Student{

    SyntaxStudent(String schoolLocation,String schoolName) {
        super(schoolLocation);
        this.schoolName=schoolName;
    }
    @Override
    public void a(){
        System.out.println("Study harder focus on java");
        System.out.println(schoolLocation+" "+schoolName);
    }
    public void b(){
        System.out.println("Always do your homeworks on time");
    }

}
class CollageStudent extends Student{

    CollageStudent(String schoolLocation,String schoolName) {
        super(schoolLocation);
        this.schoolName=schoolName;

    }
    @Override
    public void a(){
        System.out.println("Study hard and have some fun");
        System.out.println(schoolLocation+" "+schoolName);
    }
    public void b(){
        System.out.println("Always complete your essays on time");
    }
}
class SchoolStudent extends Student{
    SchoolStudent(String schoolLocation,String schoolName) {
        super(schoolLocation);
        this.schoolName=schoolName;

    }
    @Override
    public void a(){
        System.out.println("Study hard to go to a good collage");
        System.out.println(schoolLocation+" "+schoolName);
    }
    public void b(){
        System.out.println("Always improve yourself");
    }
}
