package Replit;

import java.util.Scanner;

public class Replit76 {
    public static void main(String[] args) {

        String[] array = new String[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            array[i] = scan.nextLine();

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}

  /*  The first loop is used to take user input for each of the days of the week.
    We use i <= array.length - 1 because array indices start from 0 and end at length-1,
    so we need to use the condition i <= array.length - 1 to loop over all the indices of the array.
    The second loop is used to print the days of the week. Here, we don't need to use the condition i <= array.length - 1,
     since we don't need to loop over indices, just elements of the array.

    (i + 1) + is used to print the day number. Since i starts from 0,
    we need to add 1 to it in order to get the correct day number.
    The "(i + 1)" is used to print out the number of the day the user is entering.
    For example, when the loop has run the first time, it will have the value i = 0.
    When the user is asked to enter the second day,
    the program prints out "Please enter day 1 of the week" because 1 = 0 + 1.*/
