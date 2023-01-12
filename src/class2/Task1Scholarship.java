package class2;

public class Task1Scholarship {
    public static void main(String[] args) {

        boolean diploma=true;
        double gpa=3;


        if (diploma){
            System.out.println("Congratulations!");

            if (gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("But you should have studied harder");
            }
        }else{
            System.out.println("Please consider getting a degree");
        }
    }
}
