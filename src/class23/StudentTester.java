package class23;

public class StudentTester {
    public static void main(String[] args) {
        Student [] array={new SyntaxStudent("Atlanta","Syntax Technologies"),new CollageStudent("new York","Brooklyn Collage"),new SchoolStudent("Washington DC","Sheepsheadbay High School")};
        for (Student study:array){
            study.a();
        }
    }

}
