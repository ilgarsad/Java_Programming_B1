package day15_string;

import java.util.Scanner;

/*

 */
public class C1_LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String wordOne = input.next();
        String wordTwo = input.next();
        String wordThree = input.next();

//        String wordOne = input.next(), wordTwo = input.next(), wordThree = input.next(); // -- > This is just to remember that we can declare it like this as well.
        int wordOneLength = wordOne.length(),
                wordTwoLength = wordTwo.length(),
                wordThreeLength = wordThree.length();

        if (wordOne.contains("a") && (wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength)) {
            System.out.println(wordOne + " is the biggest with \"a\"");
        } else if (wordTwo.contains("a") && (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength)) {
            System.out.println(wordTwo + " is the biggest with \"a\"");
        }  else if (wordThree.contains("a") && (wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength)) {
        System.out.println(wordThree + " is the biggest with \"a\"");
    }   else {
            System.out.println("No single largest word with \"a\"");
        }









    }
}
