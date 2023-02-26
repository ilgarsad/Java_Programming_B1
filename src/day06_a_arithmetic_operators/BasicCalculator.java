package day06_a_arithmetic_operators;

public class BasicCalculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

        //double add = 4 + 5; hard coded
        double add = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
                        //5.0 + 4.0 = 5.04.0

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        // 5.0 + 4.0 = 9.0

        System.out.println(num1 + num2 + " = " + num1 + num2);



        /*
            10 / 3 = 3.3333333

            10 % 3 = 1
                3 + 3 + 3 -> 9
                10 - 9 = 1

            5 / 4 = 1.25

            10 % 4 = 2

         */

    }
}
