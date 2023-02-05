package class19AselHomework;

public class TeacherTester {
    public static void main(String[] args) {
     MathTeacher teacher=new MathTeacher();
     teacher.name="Tom";
     teacher.nameOfSchool="Brooklyn Collage";
     teacher.subject="Math";
     teacher.age=40;
     teacher.paid=70000;
     teacher.dailyHours=7;
     teacher.teacher();
     teacher.school();
     teacher.age();
     teacher.math();
     teacher.day();

        System.out.println("________________");

    ChemistryTeacher chem=new ChemistryTeacher();
    chem.name="Kathy";
    chem.nameOfSchool="Brooklyn Collage";
    chem.subject="Chemistry";
    chem.age=37;
    chem.payment=68000;
    chem.hours=28;
    chem.teacher();
    chem.school();
    chem.age();
    chem.hour();
    chem.pay();

        System.out.println("_______________");

    PianoTeacher piano=new PianoTeacher();
    piano.name="Sarah";
    piano.nameOfSchool="Brooklyn Collage";
    piano.subject="Piano";
    piano.age=29;
    piano.fee=42;
    piano.montlyHours=47;
    piano.teacher();
    piano.school();
    piano.age();
    piano.montly();
    piano.pay();





    }
}
