package day10_a_if_statements;

import java.util.Scanner;

public class daysOfWeek {

    /*
        Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday
 */


    public static void main(String[] args) {

        //int day = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int day = input.nextInt();

        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Tuesday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Friday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");

        else System.out.println("Enter number between 1-7");




    }
}
