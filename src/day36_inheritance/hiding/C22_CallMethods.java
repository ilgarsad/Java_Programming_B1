package day36_inheritance.hiding;

import day36_inheritance.hiding.C22_A;
import day36_inheritance.hiding.C22_B;

public class C22_CallMethods {
    public static void main(String[] args) {

        C22_A obj = new C22_A();
        obj.instanceMethodA();
        C22_A.staticMethod();

        System.out.println();

        C22_B obj2 = new C22_B();
        obj2.instanceMethodA();
        C22_B.staticMethod();

    }
}
