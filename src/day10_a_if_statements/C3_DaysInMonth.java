package day10_a_if_statements;

/*

    create a int variable to represent the month number, where 1 is January and 12 is December.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

    Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Month that has 28 days: 2

 */


public class C3_DaysInMonth {

    public static void main(String[] args) {

        //12 months in a year.
        //1 - Jan
        //2 - Feb ....
        //12 - Dec ....

        int monthNumber = 0;

        boolean has31Days = monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12;

        boolean has30Days = monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11 ;

        boolean has28Days = monthNumber ==2;

        if (has31Days) {
            System.out.println("This month has 31 days");
        }

        if (has30Days) {
            System.out.println("This month has 30 days");
        }

        if (has28Days) {
            System.out.println("This month has 28 days");
        }

        else {
            System.out.println("Enter a number between 1 - 12");
            System.out.println("Wake up");
        }

        System.out.println();
        if (true){
            System.out.println("Single statement in body");
        }

        System.out.println();
        if (true) System.out.println("2nd single statement without curly braces");

        System.out.println();
        if (true) System.out.println("3rd single statement");

        System.out.println("test");


    }
}
