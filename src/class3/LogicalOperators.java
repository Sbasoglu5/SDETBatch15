package class3;

public class LogicalOperators {
    public static void main(String[] args) {

        String country="China";

        if (!country.equals("BadCountry")){
        System.out.println("You are welcome");
        }
        boolean wifi=false;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("You are good to go");
        }else{
            System.out.println("You need either wifi or 5G");
        }


    }
}
