package day32_custom_classes;

public class C8_ChainExample {

    public C8_ChainExample() {
        System.out.println("First");
    }

    public C8_ChainExample(int i) {
        this();
        System.out.println("Second");
    }

    public C8_ChainExample(String s) {
        this (12);
        System.out.println("Third");
    }

    public C8_ChainExample(double d) {
        this("test");
        System.out.println("Fourth");
    }
}
