package class9Homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What do you expect: a boy or a girl");
        String expect=input.next();
        System.out.println("Mother to be's first name:");
        String mom=input.next();
        System.out.println("Father to be's first name:");
        String dad=input.next();
        String kid;

        if (expect.equalsIgnoreCase("girl")){
            kid=(mom.substring(0,2)+(dad.substring(3)));
            System.out.println("The suggested name is "+kid);
        }else {
            kid=(dad.substring(0,2))+(mom.substring(3));
            System.out.println("The suggested name is "+kid);
        }
    }
}
