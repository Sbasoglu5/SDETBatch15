package class33Homework;

public class CheckUserName extends RuntimeException{
    public static void nameCheck(String name){
        if (name.length()<5){
            throw new CheckUserName();
        }
    }

    public static void main(String[] args) {
        try {
            nameCheck("Tom");
        }catch (CheckUserName c){
            System.out.println(c+" -> name cannot be shorter than 5 characters");
        }
    }
}
