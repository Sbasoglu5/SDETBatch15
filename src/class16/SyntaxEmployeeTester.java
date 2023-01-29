package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee task=new SyntaxEmployee();
        task.id=123456;
        task.salary=75007.88;

        SyntaxEmployee task2=new SyntaxEmployee();
        task2.id=789456;
        task2.salary=14700.69;

        System.out.println(task.id+" "+task.salary+"$"+" "+task.ceo);
        System.out.println("******");
        System.out.print(task2.id+" "+task2.salary+"$"+" "+task.ceo);

    }
}
