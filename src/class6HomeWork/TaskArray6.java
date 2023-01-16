package class6HomeWork;

import java.util.Scanner;

public class TaskArray6 {
    public static void main(String[] args) {
        String []countries={"USA","Switzerland","France","Italy","Russia"};
        String []capitals={"Washington D.C.","Bern","Paris","Rome","Moscow"};
        for (int i = 0; i <countries.length; i++) {
            System.out.println("The capital of "+countries[i]+" is "+capitals[i]);

        }
    }
}
