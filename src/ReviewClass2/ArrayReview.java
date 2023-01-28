package ReviewClass2;

import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many names do you wanna store?");
        int size=input.nextInt();
        String [] name=new String[size];
        //This loop stores elements inside the array

        //Regular for loop
        /*for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter name");
            name[i]= input.next();
        }*/
        //using loop below we can retrieve elements

        //enhanced for loop with variable
        for (String n:name){
            System.out.println("Please enter name");
            n= input.next();
        }
        System.out.println("Names have been successfully added ");
    }
}
