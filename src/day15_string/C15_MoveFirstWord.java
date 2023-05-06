package day15_string;

import java.util.Scanner;

public class C15_MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        int firstIndexOfSpace = sentence.indexOf(" ");

        String beginning = sentence.substring(0, firstIndexOfSpace);
        System.out.println(beginning);

        String secondPart = sentence.substring(firstIndexOfSpace).trim();
//        String secondPart2 = (sentence.substring(firstIndexOfSpace) + 1);
        System.out.println(secondPart);

        System.out.println(secondPart + " " + beginning);




    }
}
