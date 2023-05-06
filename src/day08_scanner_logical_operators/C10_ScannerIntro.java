package day08_scanner_logical_operators;

import java.util.Scanner;

public class C10_ScannerIntro {

    public static void main(String[] args) {

        String name = "John";
        System.out.println("My name is " + name);
        System.out.println("\n\n");


        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("You have entered: " + number);

        System.out.println();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("After 25 years you will be " + (age + 25) + " years old");


    }
}
