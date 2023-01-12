package class2;

public class Task2Mortgage {
    public static void main(String[] args) {
       double mortgageRate=4.5;
       int mortgagePrice=210000;

       if (mortgageRate>4.5) {
           System.out.println("you won't be able to buy a house");
       }else{
           System.out.println("you can consider getting one");
           if (mortgagePrice>200000){
               System.out.println("you will get a loan");
           }else{
               System.out.println("you will pay cash");
           }
       }
    }
}
