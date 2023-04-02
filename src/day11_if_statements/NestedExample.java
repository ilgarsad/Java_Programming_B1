package day11_if_statements;

import java.util.Scanner;

public class NestedExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();

        if (number >= 1 && number <= 10) {  //outer if condition

            if (number % 2 == 0) {          //Inner if condition
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else {
            System.out.println("The number is not in the range");
        }
    }
}
