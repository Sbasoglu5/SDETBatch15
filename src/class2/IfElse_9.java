package class2;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';

        if (c=='M') {
            System.out.println("Male");
            // with non-primitive data types such as String we cannot use == symbol
        }


        String name="Nat";
        if (name.equals("Sam")) {
            System.out.println("Amazing student");
        }

            if (!name.equals("Sam")) {
                System.out.println("Super Amazing student"); /* not reverses the condition
                                                                ! symbol changes true to false
                                                                */
            }
     }

}

