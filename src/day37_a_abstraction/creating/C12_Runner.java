package day37_a_abstraction.creating;

public class C12_Runner {
    public static void main(String[] args) {

        // Create obj = new Create(); cannot make objects of interfaces

        C11_Book obj = new C11_Book(); // Book is a normal (non-abstract) class
        obj.read();
        obj.write();

    }
}
