package day33_a_static;

public class C9_AccessModifier {
    public int a;
    int b;
    private int c;

    public static int x;
    static int y;
    private static int z;

    // in the same class:

    public static void main(String[] args) {

        C9_AccessModifier obj = new C9_AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(C9_AccessModifier.x);
        System.out.println(C9_AccessModifier.y);
        System.out.println(C9_AccessModifier.z);

        // access all the information

    }
}
