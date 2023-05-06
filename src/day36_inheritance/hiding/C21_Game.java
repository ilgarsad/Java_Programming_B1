package day36_inheritance.hiding;

import day36_inheritance.hiding.C19_Sports;
import day36_inheritance.hiding.C20_Soccer;

public class C21_Game {
    public static void main(String[] args) {

        C19_Sports.cheer(); // calling the cheer method from the Sports class
        System.out.println();
        C20_Soccer.cheer(); // calling the cheer method from the Soccer class

    }
}
