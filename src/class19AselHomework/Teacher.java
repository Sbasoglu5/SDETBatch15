package class19AselHomework;

public class Teacher {
    /*Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes*/
    String name;
    String nameOfSchool;
    int age;
    String subject;


    public void teacher(){
        System.out.println(this.name+" teaches "+this.subject);
    }
    public void school(){
        System.out.println(this.name+" works at "+this.nameOfSchool);
    }
    public void age(){
        System.out.println(this.name+" is "+this.age+" years old");
    }
}
class MathTeacher extends Teacher{
    double paid;
    int dailyHours;

    void math(){
        System.out.println(this.name+" is paid "+paid+"$ a year");
    }
    void day(){
        System.out.println(this.name+" works "+dailyHours+" hours a day");
    }

}
class ChemistryTeacher extends Teacher{
    double payment;
    int hours;


    public void pay(){
        System.out.println(this.name+" makes "+payment+ "$ a year");
    }
    public void hour(){
        System.out.println(this.name+" works "+hours+" a week");
    }
}
class PianoTeacher extends Teacher{
    double fee;
    int montlyHours;


    void pay(){
        System.out.println(this.name+"'s fee is "+fee+"$ per hour");
    }
    void montly(){
        System.out.println(this.name+" works "+montlyHours+" a month");
    }
}
