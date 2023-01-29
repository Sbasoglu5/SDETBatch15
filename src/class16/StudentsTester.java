package class16;

public class StudentsTester {
    public static void main(String[] args) {

        Students st=new Students();
        st.name="Sezar";
        st.id="ab123";
        st.numberOfStudents++;

        Students st2=new Students();
        st2.name="Katie";
        st2.id="bc456";
        st2.numberOfStudents++;

        System.out.println(st.name);
        System.out.println(st.id);

        System.out.println(st2.name);
        System.out.println(st2.id);

        System.out.println(st.numberOfStudents);
    }
}
