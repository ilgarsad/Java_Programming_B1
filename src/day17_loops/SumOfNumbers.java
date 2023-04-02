package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = input.nextInt();

        int numOfSum = 0;

        // continue getting a number from user until it is negative number
        while (userNum >= 0) {
            numOfSum += userNum;
            System.out.println("Sum of the numbers so far: " + numOfSum);
            System.out.println("Enter number again: ");
            userNum = input.nextInt();

            if (userNum < 0) {
                System.out.println(userNum + " is a negative number. That is why the while loop ended.");
            }
        }







    }
}
