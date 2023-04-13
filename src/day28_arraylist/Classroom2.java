package day28_arraylist;

import java.util.ArrayList;

public class Classroom2 {

    public static void main(String[] args) {

        ArrayList <String> group = new ArrayList<>();
        System.out.println(group);
        group.add("Gunel");
        System.out.println(group);
        group.add(0, "Natalia");
        System.out.println(group); // Natalia, Gunel

        // Method overloading is happening.
        group.add("Vlad");
        group.add(0, "Khoshgadam");

    }
}
