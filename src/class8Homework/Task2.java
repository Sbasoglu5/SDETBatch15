package class8Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String [] countries={"italy","usa","russia","switzerland","france"};
        String [] capitals={"Rome","Washington D.C","Moscow","Bern","Paris"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
        }

        System.out.println("**************");
        String [] countries1={"italy","usa","russia","switzerland","france"};
        String [] capitals1={"Rome","Washington D.C","Moscow","Bern","Paris"};

        int i=0;
        while (i<countries.length){
            System.out.println("The capital of " + countries1[i] + " is " + capitals1[i]);
            i++;
        }
    }
}
