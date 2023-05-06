package day34_a_static.debit;

public class C4_Bank {
    public static void main(String[] args) {
        C3_DebitCard obj1 = new C3_DebitCard(1234567890123456l, "Dariush", "Debit");
        System.out.println(obj1.cardType);


        System.out.println("----------");
        C3_DebitCard obj2 = new C3_DebitCard(12345678, "Dariush", 100.00, "Visa", 1234);
        System.out.println(obj2.cardType);


        System.out.println("----------");
        C3_DebitCard obj3 = new C3_DebitCard(12345678, "Dariush", 100.00, "MaSter", 1234);
        System.out.println(obj3.cardType);


    }
}