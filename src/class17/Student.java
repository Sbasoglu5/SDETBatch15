package class17;

public class Student {

    String name;
    String id;
    int age;
    double weight;

    Student (String stName, String stId, int stAge, double stWeight){
        name=stName;
        id=stId;
        age=stAge;
        weight=stWeight;
    }
    void info(){
        System.out.println("Name : "+name+" id NO : "+id+" Student's weight : "+weight);
    }
}
