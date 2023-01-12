package class3;

public class LogicalOperators2 {
    public static void main(String[] args) {


        double mathScore = 92.5;
        double historyScore = 70.5;
        double scienceScore = 93.5;


       /* if(mathScore>90.0){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder is Science");
                }
            }else{
                System.out.println("You need work harder in history");
            }

        }else{
            System.out.println("You need work harder with Math");
        }

        If we want to specify it as work harder in math science or history etc.
*/

        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("You are a brilliant Student");
        }else{
            System.out.println("You need work harder");
        }



        String name="Adam";
        int age=31;

        if(name.equals("Adam")&&age==30){
            System.out.println("I know you, you're Adam");
        }else{
            System.out.println("I don't know you");
        }

        boolean isTrue=false;
        if (!isTrue){
            System.out.println("You got it");
        }else{
            System.out.println("Need more practice");
        }





    }
}
