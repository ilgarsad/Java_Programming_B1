package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        // primitive data type
        int a = 5;

        // object data type
//        Integer a2 = new Integer(7);      ---> deprecated == redundant
        Integer a3 = 6;     // autoboxing:  primitive to wrapper object

        int a4 = a3;    // unboxing: wrapper object to primitive

        byte b = 2;     //  narrowing - implicit casting
        Byte b2 = 20;   // auto boxing:  primitive to wrapper object

        System.out.println(a);
        System.out.println(a3);
    }
}
