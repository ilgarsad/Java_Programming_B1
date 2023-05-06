package day09_b__if_statements;

import java.util.Scanner;

public class C12_ifElseExample {

    public static void main(String[] args) {


        int passRate = 65;

        //65 and higher passing

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your result: ");
        int result = input.nextInt();

        if (result >= passRate) {
            System.out.println("You have passed");
        }
        else {
            System.out.println("You have failed");
        }

    }
}
