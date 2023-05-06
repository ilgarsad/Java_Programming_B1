package day33_a_static;

public class C10_AccessInPackage {

    // different class, same package

    public static void main(String[] args) {

        C9_AccessModifier obj = new C9_AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(C9_AccessModifier.x);
        System.out.println(C9_AccessModifier.y);
//        System.out.println(AccessModifier.z);

        // c and z were not accessible outside the class because they were private

    }
}

