package day15_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        String initials = "" + first.charAt(0) + last.charAt(0);
//        initials = initials.toUpperCase();
        System.out.println("Your initial is: " + initials.toUpperCase());






    }
}
