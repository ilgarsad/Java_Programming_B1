package day12_switch_statements;

import java.util.Scanner;

public class C8_VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine");
        System.out.println("Please select one of the followings: \n\tDrinks\n\tSnacks\n\tGum\n\nEnter: ");

        String selection = input.next();
        String message = "";

        switch (selection) {

            case "Drinks":
                System.out.println("You choose drinks (click on 1, 2 or 3): \n\t1) Water\n\t2) Soda\n\t3) Juice\n\nYour number: ");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    message = "You have selected water";

                } else if (drinkNumber == 2) {
                    message = "You have selected soda";
                } else if (drinkNumber == 3) {
                    message = "You have selected juice";

                } else {
                    message = "Invalid entry";
                }
                break;

            case "Snacks":
                System.out.println("You choose snacks (click on 1, 2 or 3): \n\t1) Candies\n\t2) Pringles\n\t3) Chips\n\nYour number: ");
                int snackNumber = input.nextInt();

                if (snackNumber == 1) {
                    message = "You have selected Candies";

                } else if (snackNumber == 2) {
                    message = "You have selected Pringles";
                } else if (snackNumber == 3) {
                    message = "You have selected chips";

                } else {
                    message = "Invalid entry";
                }
                break;

            case "Gum":
                System.out.println("You choose gum (click on 1, 2 or 3): \n\t1) Love\n\t2) Turbo\n\t3) Dirol\n\nYour number: ");
                int gumNumber = input.nextInt();

                if (gumNumber == 1) {
                    message = "You have selected Love";

                } else if (gumNumber == 2) {
                    message = "You have selected Turbo";
                } else if (gumNumber == 3) {
                    message = "You have selected Dirol";

                } else {
                    message = "Invalid entry";
                }
                break;
            default:
                message = "Not valid selection";
        }
        System.out.println(message);
    }
}
