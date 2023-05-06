package day34_c_inheritance.animal;

public class C14_Zoo {
    public static void main(String[] args) {

        C12_Dog d = new C12_Dog();
        d.numberOfLegs = 4;

        C13_Kang k = new C13_Kang();
        k.numberOfLegs = 2;

//        d.bark(); // Polymorphism.
    }
}
