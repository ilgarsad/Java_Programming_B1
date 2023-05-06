package day38_a_abstraction.shopping;

/*
Create an abstract class OnlineShopping
    - Inherits Shopping and implements Shipping
    - Does not need to implement any abstract methods
    - Declare an abstract methods:
        viewCart()
 */
public abstract class C9_OnlineShopping extends C8_Shopping implements C6_Shipping {

    public abstract void viewCart();

}
