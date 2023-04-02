package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // with normal way
        String city1 = "Fairfax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Gaithersburg";

//        Declaring the arrays
//        String [] cities2 = {city1, city2, city3, city4, city5, city6};

        // String  cities2 [] = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"}; // Pay attention to square bracket [] location. This is another way to declare

        String [] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};

        // How to reach each element?
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);
//        System.out.println(cities[6]);    ArrayIndexOutOfBoundsException
        System.out.println("-----------------------");
        // How I can print all elements in array?

        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", ......");

        System.out.println(cities);     //We can not print all elements this way. This only prints the memory location of the value

//        Arrays.toString(parameter);

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));
        System.out.println(Arrays.toString(cities).substring(1, Arrays.toString(cities).length()-1));

        String allCities = Arrays.toString(cities);
        System.out.println(allCities);

        System.out.println("-----------------------");

        // How do we get the number of elements in array

        System.out.println(cities.length);

        System.out.println(Arrays.toString(cities).length());

    }
}
