package class4;

import java.util.Scanner;

public class LogicalAndDemo {
    public static void main(String[] args) {
        String password="Pass123";
        System.out.println(password.equals("Pass123"));

        if (!password.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;

        if (!isRaining){
            System.out.println("Let's take a walk");
        }else{
            System.out.println("Let's take the umbrella");
        }
        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter a day");
        String day=input.next();

        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("There's no class today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class Enjoy!");
        } else if (day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")){
            System.out.println("Manual testing class");
        } else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else {
            System.out.println("Wrong day entered");
        }
        input.close();


    }
}
