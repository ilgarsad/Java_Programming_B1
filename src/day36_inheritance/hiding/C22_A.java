package day36_inheritance.hiding;

public class C22_A {

    public void instanceMethodA(){
        staticMethod();
    }

    public static void staticMethod(){
        System.out.println("Static method from the PARENT class");
    }

}

