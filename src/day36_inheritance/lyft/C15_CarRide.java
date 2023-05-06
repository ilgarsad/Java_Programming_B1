package day36_inheritance.lyft;

import day36_inheritance.lyft.C13_Lyft;
import day36_inheritance.lyft.C14_LyftXL;

public class C15_CarRide {

    public static void main(String[] args) {
        C13_Lyft obj1 = new C13_Lyft("James");
        System.out.println(obj1.calculateRate(10));

        C14_LyftXL obj2 = new C14_LyftXL("James");
        System.out.println(obj2.calculateRate(10));

    }

}
