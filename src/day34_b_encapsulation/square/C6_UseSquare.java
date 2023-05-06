package day34_b_encapsulation.square;

public class C6_UseSquare {
    public static void main(String[] args) {

        C5_Square obj1 = new C5_Square(22);
        //obj1.side = 22;
        obj1 = new C5_Square(44);


        C5_Square obj2 = new C5_Square(-33);
        //System.out.println(obj2.side); //since side is private I cant access this was
        System.out.println(obj2.getSide()); //


        C5_Square obj3 = new C5_Square(55);
        System.out.println(obj3.getSide()); //


        System.out.println(obj3.calculateArea());
        System.out.println(obj3.calculatePerimeter());

    }

}