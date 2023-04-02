package day11_if_statements;
/*
ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:
 */

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number based on the language you want to use: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French");
        int languageNum = input.nextInt();

        String message;

        if (languageNum == 1) {
            message = "Hello, thank you for the call";
        } else if (languageNum == 2) {
            message = "Hola, gracias por la llamada.";
        } else if (languageNum == 3) {
            message = "Merhaba, aradiginiz icin tesekkur ederiz";
        } else if (languageNum == 4) {
            message = "Здравствуйте, спасибо за звонок";
        } else if (languageNum == 5) {
            message = "Bonjour, merci pour l'appel";
        } else if (languageNum == 6) {
            message = "Tez de gorum, konturum qurtarir";
        } else {
            message = "Invalid input";
        }

        System.out.println(message);


    }
}
