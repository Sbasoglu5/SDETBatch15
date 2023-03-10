package class23;

public class StudentTester {
    public static void main(String[] args) {
        Student [] array={new Student("A"),new SyntaxStudent("Atlanta","Syntax Technologies"),new CollageStudent("New York","Brooklyn Collage"),new SchoolStudent("Washington DC","Sheepsheadbay High School")};
        for (Student study:array){
            study.a();
            study.b();
        }
    }

}
