package day09_b__if_statements;

import java.util.Scanner;

public class C13_CheckHunger {

        /*
    boolean variable isHungry

            if the person is hungry,print: You are hungry, so I will get some food for you

            if the person is not hungry, print: Great, then practice java
     */

    public static void main(String[] args) {

        //Crate a Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("Are you hungry? (true or false) ");
        boolean ishungry = input.nextBoolean();

        if (ishungry) {
            System.out.println("Let's for to Texas DeBrazil");
        } else {
            System.out.println("I con not stay without eating. Give me some DOLMA");
        }


    }
}
