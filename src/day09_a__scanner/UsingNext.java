package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {

        //Create a scanner object
        Scanner input = new Scanner (System.in);

        System.out.println("Today is Saturday");
        System.out.print("What is today's class? ");

        String className = input.next();

        System.out.println();

        System.out.print("What month is it? ");
        String month = input.next();
        //System.out.println(input.next());
        System.out.println("I like " + month + " month");
        System.out.println();

        input.nextLine();
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println(" Full name is " + fullName);

        //In scanner there is a method called .close(); This method closes the Scanner Class properly. You do not need to use it. It's optional.
        input.close();
    }
}
