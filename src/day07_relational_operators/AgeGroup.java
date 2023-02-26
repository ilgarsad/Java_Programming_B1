package day07_relational_operators;

public class AgeGroup {

    /*

    declare and assign an age variable

    check if the person is a kid
        age ---> up to and including 13

    check if that person is adult
        adult ---> 30 or higher

     */

    public static void main(String[] args) {

        int ageOfPerson = 40;

        boolean isKid = ageOfPerson <= 13;      // value ALWAYS has to be either true or false
        System.out.println("You are a kid. Correct? " + isKid);

        boolean isAdult = ageOfPerson >= 30;
        System.out.println("You are an adult. Rignt? " + isAdult);




    }
}
