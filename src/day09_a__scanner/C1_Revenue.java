package day09_a__scanner;

import java.util.Scanner;

public class C1_Revenue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Java creates an object here

        double price;       //Java declares a price that has the data type of double
        int quantity;       //Java declares a quantity that has the data type of int

        System.out.println("Enter the price and quantity: ");       //Java says print out whatever is in double quote

        price = input.nextDouble();     //Java asks user to put input/info then assigns that value to price variable
        quantity = input.nextInt();     //Java asks user to put input/info then assigns that value to quantity variable

        double revenue = price * quantity;

        System.out.println("Your revenue: $" + revenue);

//        System.out.println();
//        System.out.println(price);
//        System.out.println(quantity);

    }
}
