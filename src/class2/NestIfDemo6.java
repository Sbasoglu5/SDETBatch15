package class2;

public class NestIfDemo6 {
    public static void main(String[] args) {
        int money = 100;
        String day = "Sunday";
        boolean mood = true;

        if (money>700){

            if (mood){
                System.out.println("Lets go shopping");
            }

        }else {
            System.out.println("Lets save more first");
        }

    }
}
