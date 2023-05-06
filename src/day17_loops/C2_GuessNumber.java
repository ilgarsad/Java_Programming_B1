package day17_loops;

import java.util.Scanner;

public class C2_GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNum = 34;
        int guess;

        do {

            System.out.println("Guessed number between 1 - 100 to find secret number: ");
            guess = input.nextInt();

            if (guess < secretNum) {
                System.out.println("Its too low");
            } else if (guess > secretNum) {
                System.out.println("Its too high");
            }

        } while (guess != secretNum);
        System.out.println("You guessed the correct number which is " + secretNum);



    }
}
