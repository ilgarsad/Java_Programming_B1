package day06_a_arithmetic_operators;

public class C13_MyName {



    public static void main(String[] args) {

        char letterOne = 'I';
        char letterTwo = 'l';
        char letterThree = 'g';
        char letterFour = 'a';
        char letterFive = 'r';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);

        System.out.println();

        System.out.println(letterOne + letterTwo + letterThree + letterFour + letterFive);

        System.out.println("My name: " + letterOne + letterTwo + letterThree + letterFour + letterFive);

        String name = "" + letterOne + letterTwo + letterThree + letterFour + letterFive;
        System.out.println(name);
    }
}
