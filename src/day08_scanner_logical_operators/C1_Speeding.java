package day08_scanner_logical_operators;

public class C1_Speeding {

    /*
        Declare 3 variables:
            Current speed
            Speed limit
            Speeding

            print
            "Is this person speeding?" true or false
     */

    public static void main (String [] args) {

        int currentSpeed = 65;       //mph
        int speedLimit = 65;         //mph
        boolean speeding = currentSpeed > speedLimit;

        System.out.println("Is this person speeding? " + speeding);

        /*
        We should consider all the possible outcomes. In this case the right question to ask is what happens if the car is at 65mph.
        Always ask the responsible party and do not decide yourself. Asking right questions at the right time is the key to the success
         */


    }
}
