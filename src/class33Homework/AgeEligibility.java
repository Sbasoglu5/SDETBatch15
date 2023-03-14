package class33Homework;



public class AgeEligibility extends RuntimeException{
   public static void checkAge(int age){
       if (age<16){
           throw new AgeEligibility();
       }
   }

    public static void main(String[] args) {
       try {
           checkAge(15);
       }catch (AgeEligibility a){
           System.out.println(a+" -> Age is less than 16");
       }
    }
}
