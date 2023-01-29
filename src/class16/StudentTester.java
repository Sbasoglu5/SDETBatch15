package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student st=new Student();
        st.name="Zafar";
        st.id="123";
        st.schoolName="Syntax";
        st.age=22;
        st.weight=70;

        Student student1=new Student();
        student1.name="Hamid";
        student1.id="456";
        student1.age=5;
        student1.weight=86;
//        student1.schoolName="Syntax";

        Student student2=new Student();
        student2.name="Nelson";
        student2.id="789";
        student2.age=26;
        student2.weight=90;
//        student2.schoolName="Syntax";

        System.out.println(Student.schoolName);// can be called by the class name
    }
}
