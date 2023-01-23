package class9;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Sezar";
        String lastName="Basoglu";
        String fullName=firstName+ " "+lastName;
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat(" "+lastName));
    }
}
