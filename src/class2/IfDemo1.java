package class2;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 12000;

        if (money > 1000) {
            System.out.println("Lets buy an iphone");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a Mac");
        }

        if (money < 12500) {


            System.out.println("Lets slow down");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mother's day");
        }
        String name = "Sezar";
        if (name.equals("Sezar")) {
            System.out.println("I love Katie");
        }
    }
}
