package day39_polymorphism.clothes;

public class C4_Jacket extends C1_Clothes implements C2_HasHood {

    @Override
    public void wear() {
        System.out.println("Wearing a Jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting the hood on");
    }
}