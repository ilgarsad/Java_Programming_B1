package day09_b__if_statements;

import java.util.Scanner;

public class C15_BankAccount {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = input.nextDouble();

        System.out.print("How much do you want to withdraw? ");
        double withdraw = input.nextDouble();

        //balance = balance-withdraw;
        //balance -= withdraw;
//        if (balance < withdraw) {
//            System.out.println("You don't have sufficient funds");

        if (balance < withdraw) {
            System.out.println("You don't have sufficient funds");
        }else {

            balance -= withdraw;
            System.out.println();
            System.out.println("Your new balance is: $" + balance);
        }
    }
}
