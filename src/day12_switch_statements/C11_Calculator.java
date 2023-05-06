package day12_switch_statements;

import java.util.Scanner;

public class C11_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double numbOne = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        double numbTwo = input.nextDouble();

        System.out.print("Select operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\t Enter: ");
        String operator = input.next();

        boolean isValidOperator = true;

        double result = 0;

        switch (operator) {

            case "+":
                result = numbOne + numbTwo;
                break;
            case "-":
                // if numOne  > numTwo ---- > numOne - numTwo
                // else numTwo - NumOne
                if (numbOne > numbTwo) {
                    result = numbOne - numbTwo;
                } else {
                    result = numbTwo - numbOne;
                }
                break;
            case "*":
                result = numbOne * numbTwo;
                break;
            case "/":
                // 4/0 --- > not ok
                // 0/4 --- > ok
                if (numbTwo != 0) {
                    result = numbOne / numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                // 4/0 --- > not ok
                // 0/4 --- > ok
                if (numbTwo != 0) {
                    result = numbOne % numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator + " is not a valid for this calculator");
                isValidOperator = false;
        }

        if (isValidOperator) {
            System.out.println(numbOne + " " + operator + " " + numbTwo + " = " + result);
        }

    }
}

//        double num1, num2, result;
//        char operator;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        num1 = scanner.nextDouble();
//
//        System.out.print("Enter second number: ");
//        num2 = scanner.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        operator = scanner.next().charAt(0);
//
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                result = num1 / num2;
//                break;
//            default:
//                System.out.println("Invalid operator!");
//                return;
//        }
//
//        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
//    }




