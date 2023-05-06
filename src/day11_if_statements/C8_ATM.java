package day11_if_statements;

import java.util.Scanner;

public class C8_ATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*** WELCOME to ATM ***\n\nPlease insert your card and enter 4 digits pin code!\n\tPIN CODE: ");

        int userPin = input.nextInt();

        int expectedPin = 3456;

        if (userPin == expectedPin) {

            System.out.println("Logged In");
            System.out.println("Select one of the options below: ");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("\n\tEnter option: ");

            int option = input.nextInt();

            if (option == 1) {
                System.out.println(" Your balance is: $" + 100_000);

            } else if (option == 2) {
                System.out.println("How much do you want to withdraw? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("You are withdrawing " + withdrawAmount);
            } else if (option == 3) {
                System.out.println("Please deposit the money!");
            } else {
                System.out.println("Invalid selection. Exiting the account");
            }

        } else {
            System.out.println("Invalid pin number. Please try again.");
        }
    }
}
