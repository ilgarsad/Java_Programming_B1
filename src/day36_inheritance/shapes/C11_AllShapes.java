package day36_inheritance.shapes;

public class C11_AllShapes {
    public static void main(String[] args) {

        C10_Square obj1 = new C10_Square(4.5);
        System.out.println(obj1);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());

        C12_Circle obj2 = new C12_Circle(0.5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());

    }
}