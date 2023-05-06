package day36_inheritance.final_example;

import day36_inheritance.final_example.C16_FinalExample;

//public class UseFinalExample extends FinalExample { this is not valid because the FinalExample class was final, so it cannot be inherited
public class C17_UseFinalExample {
    public static void main(String[] args) {

        System.out.println(C16_FinalExample.PLANET);
//        FinalExample.PLANET = "Mars";

        C16_FinalExample obj = new C16_FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

//        obj.a = 4;
//        obj.b = 40;

        System.out.println();
        C16_FinalExample obj2 = new C16_FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);

        /*

        obj and obj2 were separate objects. Each object has its own copy of instance variables a and b, both are final, so they cannot be changed.

        a was hardcoded to be 5 in the class
        b was assigned in the constructor call
         */

    }
}
