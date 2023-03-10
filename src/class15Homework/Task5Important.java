package class15Homework;

public class Task5Important {
//Write num method to return whether given number is prime or not?
   boolean isPrime(int num){
    boolean flag=true;
    if (num>1){
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                flag = false;
                break;
            }
        }

            }else {
                flag = false;
            }
        return flag;
    }
}