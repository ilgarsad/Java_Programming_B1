package day33_a_static;

public class C11_AccessOutsidePackage {

    // different class, different package

    public static void main(String[] args) {

        C9_AccessModifier obj = new C9_AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(C9_AccessModifier.x);
//        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        // c and z are private, so they can only be accessed in the same class

        // b and y are default (didn't have any other access modifier), so they can only be accessed in the same package

        // so what is accessible outside a package:
        // public

    }

}