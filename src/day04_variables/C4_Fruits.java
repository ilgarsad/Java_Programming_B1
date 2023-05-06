package day04_variables;

public class C4_Fruits {

    public static void main(String[] args) {

        //crate 3 variables called apple, grapes and bananas, --> dataType is int and assing values 50, 100, 150 respectfully

//        int apples = 50;
//        int grapes = 100;
//        int bananas = 150;

        int apples = 50, grapes = 100, bananas = 100;  //We can only do this when the dataType is same.

        //lets print out this is how many apples we have

        System.out.println("This is how many apples we have: " + apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        //We gave 20 apples to a friend

        apples = 30;
        System.out.println("Apples: " + apples);

        //declare new variable called price and assign a value  20.0
        double price = 20.0;

        //Write a statement: "The price for 100 grapes is $20.0"
        System.out.println("The price for " + grapes + " grapes is $" + price);

    }
}
