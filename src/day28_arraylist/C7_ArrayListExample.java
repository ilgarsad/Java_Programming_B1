package day28_arraylist;

import java.util.ArrayList;

public class C7_ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        // add/assign to an array [index] = value

        numbers.add(100); // adds 100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-100); // adds -100 to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);

        // in array how do we access each element: arr[index]

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        //System.out.println(numbers.get(30)); out of bounds

        // how do you know how many elements are in the array: arr.length
        // is length a method --> no

        System.out.println(numbers.size());


    }
}
