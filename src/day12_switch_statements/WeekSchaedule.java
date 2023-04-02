package day12_switch_statements;

import java.util.Scanner;

public class WeekSchaedule {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String dayOfWeek = input.next();

        String message = "";

        switch (dayOfWeek) {

            case "Monday":
            case "Mon":
            case "MONDAY":
            case "Friday":
            case "Fri":
            case "FRIDAY":
                message = "We do not have a class";
                break;
            case "Wednesday":
            case "Wed":
            case "WEDNESDAY":
            case "Thursday":
                message = "We have java class at 7pm";
                break;
            case "Saturday":
            case "Sat":
            case "SATURDAY":
                message = "We have java class at 9:30 am";
                break;
            case "Sunday":
                message = "We have a Soft Skills day";
                break;
            default:
                message = "Invalid entry";


        }
        System.out.println(message);
    }
}
