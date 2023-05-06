package day38_a_abstraction.shopping;

public class C11_Runner {
    public static void main(String[] args) {

        /*

        Shopping and OnlineShopping are abstract classes, so we can't make object of them

        Shipping is an interface, so we can't make an object of it

         */

        C7_Target target = new C7_Target();
        target.price = 10;
        System.out.println(target.price);
        target.buyItem();
        target.returnItem();
        //target.payForShipping(true); Target class does not implement the Shipping interface

        System.out.println();

        C10_Amazon amazon = new C10_Amazon();
        amazon.price = 1000;
        System.out.println(amazon.price);
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);

        System.out.println(C6_Shipping.country); // proper way to access static information in the interface


    }
}
