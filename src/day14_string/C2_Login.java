package day14_string;
 /*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "loopcamp"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password
*/

import java.util.Scanner;

public class C2_Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your user name: ");

        String userName = input.next();
//        System.out.println("Before .toLowerCase() method: " + userName);

        userName = userName.toLowerCase();
//        System.out.println("After .toLowerCase() method: " + userName);

        System.out.println("Please enter the password: ");
        String password = input.next();


        // method -- > .length();
        int passwordLength = password.length();
        System.out.println(passwordLength);

        if (passwordLength >= 8 && userName.equals("loopcamp")) {
            System.out.println("You are logged in as " + userName);
        } else {
            if (passwordLength < 8) {
                System.out.println("Invalid password");
            }
            if (!userName.equals("loopcamp")) {
                System.out.println("Invalid username");
            }
        }
    }
}
