package class19AselHomework;

public class ClassATester {
    public static void main(String[] args) {
        ClassA student=new ClassA();
        student.schoolName="Syntax";
        student.grade=2;
        student.buildingNo='A';
        student.printF();
        System.out.println("-----------------");

        ClassB student1=new ClassB();
        student1.name="Tom";
        student1.idNum="stx123456";
        student.printF();
        student1.subInfo();



        System.out.println("------------------");

        ClassC student2=new ClassC();
        student2.userName="Katy";
        student2.password="stx789321";
        student.printF();
        student1.subInfo();
        student2.subInfo2();

    }
}
