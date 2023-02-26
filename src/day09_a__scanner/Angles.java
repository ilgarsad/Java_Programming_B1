package day09_a__scanner;

 /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        //Crate a scanner object
        Scanner input = new Scanner(System.in);

        //asks the user to enter 3 angle numbers
        System.out.println("Enter 3 angle numbers");
        double angleOne = input.nextDouble(),
                angleTwo = input.nextDouble(),
                angleThree = input.nextDouble();

        // for triangle ---> sum of inner angles is always 180.

        //Calculate what is the total of 3 angles
        double total = angleOne + angleTwo + angleThree;

        //Write a print statement that prints if it is triangle
        System.out.println("It is triangle: " + (total == 180));

        //Write a print statement that prints if it is triangle
        System.out.println("It is circle: " + (total == 360));

        //Write a print statement that prints if it is EITHER triangle OR circle
        System.out.println("It is either triangle or circle: " + (total == 180 || total == 360));
    }
}
