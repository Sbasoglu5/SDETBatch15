package class16;

public class Student {
    String name;
    String id;
    static String schoolName;
    int age;

    double weight;

    void printName(){
        int ssn=12346789;
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo(){
//        System.out.println(name); can't be accessed here
        System.out.println(schoolName);
    }
}


