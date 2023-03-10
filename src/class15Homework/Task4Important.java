package class15Homework;

public class Task4Important {
    //Create a method that will say Hello in different language based on the country
    // that will be passed when method is executed
        String language(String country){
        switch (country.toLowerCase()){
            case"england":

            case"australia":

            case"new zealand":

            case"usa":
                return "Hello!";

            case "french":
                return "Bonjour!";

            case "spanish":
                return "Hola!";

            default:
                return"Not applicable";

        }
    }
}
