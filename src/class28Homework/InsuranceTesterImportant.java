package class28Homework;

import java.util.ArrayList;

public class InsuranceTesterImportant {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Pet love","Cat"));
        insurances.add(new Health("Allianz"));

        for (Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
        System.out.println("__________________________________________");

       insurances.forEach(i->i.getQuote());
       insurances.forEach(i -> i.cancelInsurance());

        System.out.println("___________________________________________");

        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }

    }
}
