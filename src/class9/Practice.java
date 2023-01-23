package class9;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
        Only after all requirements met → message “Your username and password has been created”*/


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your user name");
        String fullName= input.next();
        System.out.println("Please enter your password");
        String password= input.next();
        System.out.println("Please reenter your password");
        String reenter= input.next();
        if (fullName.isEmpty()||password.isEmpty()) {
            System.out.println("User name and password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(fullName)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(reenter)) {
            System.out.println("Passwords do not match");
        }else
      


        System.out.println("Your username and password have been created");
    }
}
