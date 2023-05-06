package day32_custom_classes;

public class C9_UsingChaining {

    public static void main(String[] args) {
        C8_ChainExample ch1 = new C8_ChainExample();
        C8_ChainExample ch2 = new C8_ChainExample("test");

        new C8_ChainExample(4.2);

        System.out.println("---------------------");
        new C8_ChainExample(3.2);
    }
}
