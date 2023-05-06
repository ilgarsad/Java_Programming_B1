package day33_a_static;

public class C6_AppleStore {
    public static void main(String[] args) {

        C5_IPhone phone = new C5_IPhone("iphone X", 1000);
        System.out.println(phone);

        C5_IPhone phone2 = new C5_IPhone("Iphone 11", 1200);
        System.out.println(phone2);

        System.out.println(C5_IPhone.company);
        System.out.println(C5_IPhone.os);

    }
}
