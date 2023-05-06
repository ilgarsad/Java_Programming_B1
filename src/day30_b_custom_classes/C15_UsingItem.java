package day30_b_custom_classes;
/*
create object of Item class and assign "Apple" to the name instance variable and 3.99 to prices instance variable
 */
public class C15_UsingItem {
    public static void main(String[] args) {
        C14_Item fruit1 = new C14_Item();
//        System.out.println(fruit1);   // If you write this line of code and if you do not have toString() method in Item class ---> it will show some memory location.

        fruit1.name = "Apple";
        fruit1.price = 3.99;

        System.out.println(fruit1);

        System.out.println("--------------");

        C14_Item fruit2 = new C14_Item();
        fruit2.name = "Banana";
        fruit2.price = 2.99;
        System.out.println(fruit2);

    }
}
