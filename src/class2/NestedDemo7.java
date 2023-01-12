package class2;

public class NestedDemo7 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if (studyHard){

            System.out.println("We get the jobs");

            if (salary>100000){
                System.out.println("Lets buy a Tesla");
            }else {
                System.out.println("Lets buy a Toyota");
            }


        }else{
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
