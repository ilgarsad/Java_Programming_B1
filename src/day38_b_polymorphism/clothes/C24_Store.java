package day38_b_polymorphism.clothes;

public class C24_Store {
    public static void main(String[] args) {

        // All possible objects of TShirt

        C21_TShirt tshirt1 = new C21_TShirt(); // reference of itself
        tshirt1.wear();

        C20_Clothes tshirt2 = new C21_TShirt(); // reference of parent
        tshirt2.wear();

        Object tshirt3 = new C21_TShirt();
//        tshirt3.wear(); Object class does not have reference to the wear() method

//        HasHood tshirt4 = new TShirt(); Tshirt class does not implement HasHood interface

        // -------------------------------

        // All possible objects of Jacket
        System.out.println();

        C23_Jacket jacket1 = new C23_Jacket(); // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        C20_Clothes jacket2 = new C23_Jacket(); // reference of the super class
        jacket2.wear();
//        jacket2.putOnHood(); Clothes reference does not have access to a putOnHood()

        Object jacket3 = new C23_Jacket(); // reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class does not have reference to wear() or putOnHood() methods

        C22_HasHood jacket4 = new C23_Jacket();
//        jacket4.wear(); HasHood reference does not have visibility to wear() method
        jacket4.putOnHood();


        System.out.println();

        buy(tshirt1);
        buy(jacket1);
        buy(new C21_TShirt());
        buy(new C23_Jacket());
    }

    public static void buy(C20_Clothes clothes){
        if(clothes instanceof C21_TShirt){
            System.out.println("Bought TShirt");
        } else if(clothes instanceof C23_Jacket){
            System.out.println("Bought a cool Jacket");
        }
    }

//    public static void buy(Jacket jacket){
//
//    }

//    public static void buy(TShirt tShirt){
//
//    }


}