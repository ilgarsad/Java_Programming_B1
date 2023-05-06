package day36_inheritance.access.b;

import day36_inheritance.access.a.C5_First;

public class C7_Third {

    // different class, different package

    public static void main(String[] args) {
        C5_First obj = new C5_First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
    }

    // four is private, only visible in the same class
    // three is default, only visible in the same package
    // two is protected, no inheritance, so no visibility

}
