package day21_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthNum = input.nextInt();

        String [] allMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.print("The number you entered represents: " + allMonths[monthNum-1]);

    }
}
