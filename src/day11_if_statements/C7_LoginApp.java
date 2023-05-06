package day11_if_statements;
/*
inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
example expected:
    pin: 1552
    ssn: 1234

outputs:

when the pincode and ssn match the expected print:
    Authentication successful

when the pincode or ssn are not correct print:
    Authentication failed

when the pincode was not correct print:
    incorrect pin code

when the ssn is not correct print:
    invalid ssn
 */

import java.util.Scanner;

public class C7_LoginApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter 4 digit pin code: ");
        int userPinCode = input.nextInt();
        System.out.print("Enter last four digits of your SSN: ");
        int userSnn$Digits = input.nextInt();

        int expectedPinCode = 1234;
        int expected4SnnDigit = 4321;

        if (userPinCode == expectedPinCode && userSnn$Digits == expected4SnnDigit) {
            System.out.println("Authentication Successful");

        } else {
            System.out.println("Authentication Failed");

            if (userPinCode != expectedPinCode) {
                System.out.println("You have entered invalid pin code");
            }
            if (userSnn$Digits != expected4SnnDigit) {
                System.out.println("You have entered invalid SSN 4 digits");
            }

        }


    }
}
