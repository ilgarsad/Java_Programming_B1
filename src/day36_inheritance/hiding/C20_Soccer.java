package day36_inheritance.hiding;

import day36_inheritance.hiding.C19_Sports;

public class C20_Soccer extends C19_Sports {


    public static void cheer(){
        System.out.println("Cheering from the Child class");
    }

    /*
        Note:

        it looks like we are overriding
        but we are not, because the method static

        we are hiding the cheer method from the parent class


     */

}

