package day37_a_abstraction.creating;

public class C11_Book implements C10_Create {

    @Override
    public void read() {
        System.out.println("Reading the book");
    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}
