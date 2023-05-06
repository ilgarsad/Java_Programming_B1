package day18_loops;

import java.util.Scanner;

public class C15_ReverseMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 word sentence: ");
        String str = input.nextLine();

        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");

        String middle = str.substring(firstSpace + 1, lastSpace);
        String reverse = "";

        for (int i = middle.length() - 1; i >= 0 ; i--) {

            reverse += middle.charAt(i);
        }

        System.out.println(str.substring(0, firstSpace) + " " + reverse + str.substring(lastSpace));
    }
}
