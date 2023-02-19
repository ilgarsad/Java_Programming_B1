package day06_a_arithmetic_operators;

public class DifferentTypes {

    public static void main (String [] args) {

        System.out.println(10 - 5);     //5
        System.out.println(5 * 10);     //50

        System.out.println(10.0 / 5);   //2.0 If there are different data types with arithmetic operator the result is whatever is bigger data type.

        System.out.println(10 / 5.0);   //2.0

        System.out.println(10.0 / 5.0);
        System.out.println((int)(10.0 / 5.0));

        System.out.println((double)5 * 2);      //10.0

        byte b1 = 5;
        short s1 =6;

        System.out.println(b1 * s1);        //30 - int
        System.out.println(b1 + s1);        //11 - int

    }
}
