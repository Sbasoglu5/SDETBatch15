package class20Asel;

public class Parent {

    String name;
    static String lastName;



    public void hello(){
        System.out.println("public method hello from the parent class");
    }

    protected static void bye(){
        System.out.println("Protected method bye from the parent class");
    }

    private void money(){
        System.out.println("Private method money from the parent class");
    }
}
