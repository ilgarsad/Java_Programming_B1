package day11_if_statements;
/*

    you will have a number

    if the number is divisible by 3 print -> Fizz
    if the number is divisible by 5 print -> Buzz
    if the number is divisible by both 3 and 5 -> FizzBuzz
    if the number is not divisible by any of those, print just the number

  */
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

//        if (number % 3 == 0 && number % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (number % 3 == 0 && number % 5 != 0) {
//            System.out.println("Buzz");
//        } else if (number % 3 != 0 && number % 5 == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println("Your number is not Fizz, Buzz or FizzBuzz: " + number );
//        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Your number is not Fizz, Buzz or FizzBuzz: " + number );
        }
    }


}
