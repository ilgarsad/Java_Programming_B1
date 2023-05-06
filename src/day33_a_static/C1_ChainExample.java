package day33_a_static;

public class C1_ChainExample {
    public C1_ChainExample(){
//        this(4); this is not valid because the chaining contain themselves
        System.out.println("First");
    }

    public C1_ChainExample(int i){
        this();
        System.out.println("Second");
    }

    public C1_ChainExample(String s){
        this();
        System.out.println("Third");
    }

    public C1_ChainExample(double d){
        this(0);
        System.out.println("Fourth");
    }
}
