package class17Homework;

public class Task4 {
    /*Write program that have static constructor and observe result.*/
    String name;
    String school;
    int id;
    int age;

   /*static cannot be used with constructions */
   Task4(String name2, String school2, int id2, int age2){
        name=name2;
        school=school2;
        id=id2;
        age=age2;

    }
    void print() {
        System.out.println(name+school+id+" "+age);
    }

    public static void main(String[] args) {
        Task4 sta=new Task4("Tom "," Syntax ",789,19);
        sta.print();
    }
}
