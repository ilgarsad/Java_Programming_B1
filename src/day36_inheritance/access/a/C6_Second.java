package day36_inheritance.access.a;

import day36_inheritance.access.a.C5_First;

public class C6_Second {

    // different class, same package

    public static void main(String[] args) {
        C5_First obj = new C5_First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four);
    }

    // four is not accessible because it is private

}
