package day31_custom_class;

public class C13_UsingPhone {
    public static void main(String[] args) {

        C12_Phone phone1 = new C12_Phone("IPhone");
        System.out.println(phone1);
        System.out.println("----------------------");


        C12_Phone phone2 = new C12_Phone( "Iphone", "Apple");
        System.out.println(phone2);
        System.out.println("----------------------");

        C12_Phone phone3 = new C12_Phone( "Iphone", "Apple", 256, 16.4 );
        System.out.println(phone3);

    }


}