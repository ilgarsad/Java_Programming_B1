package day38_b_polymorphism.clothes;

public class C23_Jacket extends C20_Clothes implements C22_HasHood {

    @Override
    public void wear() {
        System.out.println("Wearing a jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting the jacket hood on");
    }
}
