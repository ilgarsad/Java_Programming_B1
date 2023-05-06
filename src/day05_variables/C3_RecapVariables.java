package day05_variables;

public class C3_RecapVariables {

    public static void main(String[] args) {

        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        //We can not print the variables because they don't have a value.

//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 12.21;
        totalStudentsInClass = 543;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        //2 * 543
        System.out.println(numberOfCoffeeCups + " * " + totalStudentsInClass);
        System.out.println(numberOfCoffeeCups * totalStudentsInClass);

        //Declare and assign
        double temperature = 28.6;
        int javaDays = 5;

        System.out.println("\nThis is my temperature: " + temperature);

        //It is day 5 in java class
        System.out.println("It is day " + javaDays + " in java class");

    }
}
