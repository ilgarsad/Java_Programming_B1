package day06_b_unary_operators;

public class C9_Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTV = 100;

        System.out.println("I have a total of " + numberOfTV + " TV's");
        System.out.println("Person comes into the store and they bought one TV");

        //numberOfTV = numberOfTV - 1;
        System.out.println("Number of TV left in the store: " + --numberOfTV);

        System.out.println("Another person comes into the store and puts the TV into his cart");
        System.out.println("Available TV in the store " + numberOfTV--);
        System.out.println("The same person who had the TV in his cart bought the TV");
        System.out.println("Now we have TV in total: " + numberOfTV);
    }
}
