package day36_inheritance.access.b;

import day36_inheritance.access.a.C5_First;

public class C8_Four extends C5_First {

    // different class, different package
    // with inheritance

    public static void main(String[] args) {
        C5_First obj = new C5_First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        C8_Four obj2 = new C8_Four();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); // protected
    }

    /*

    line 13 is trying to directly access a protected variable outside of the package. You cannot directly access any protected information outside of the package

    line 19 we are able to access the two variable because it is inherited from the First class to the Four class, so the two variable belongs to the objects of the Four class (sub class)

     */

}