package class28Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes-Benz");
        cars.add("Hyundai");

        System.out.println(cars);
        for (String names:cars){
            System.out.println(names);
        }
        Iterator<String> models= cars.iterator();
        while (models.hasNext()){
            String s=models.next();
            System.out.println(s);
        }
        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(car);
        }
    }
}
