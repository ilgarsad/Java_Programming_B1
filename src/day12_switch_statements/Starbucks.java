package day12_switch_statements;
/*

 Declare price and calories variables

 Ask the user to enter which size drink they want

 Based on the drink size determine the price and calories of the order

 At the end print the details of the order

     data:

         size: tall
         price: 2.50
         calories: 100

         size: grande
         price: 4.00
         calories: 150

         size: venti
         price: 4.50
         calories: 200

  */

import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What size of drink would you like? (tall, grande, venti) ");
        String size = input.next();

        double price = 0.0;
        int calories = 0;

        switch (size) {
            case "tall":
                price = 2.5;
                calories = 100;
                if (size == "tall") {


                }
                System.out.println("You ordered " + size + " coffee which costs $" + price + " and has " + calories + " calories");
                break;
            case "grande":
                price = 4.0;
                calories = 150;
                if (size == "grande") {


                }
                System.out.println("You ordered " + size + " coffee which costs $" + price + " and has " + calories + " calories");
                break;
            case "venti":
                price = 4.50;
                calories = 200;

                if (size == "venti") {


                }
                System.out.println("You ordered " + size + " coffee which costs $" + price + " and has " + calories + " calories");
                break;
            default:
                System.out.println("invalid entry");


        }

    }
}

