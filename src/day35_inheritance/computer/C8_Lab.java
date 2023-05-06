package day35_inheritance.computer;

public class C8_Lab {
    public static void main(String[] args) {
        C7_Windows comp1 = new C7_Windows(512);
        C9_Mac comp2 = new C9_Mac(256);

        System.out.println(comp1.os);
        System.out.println(comp2.os);

        C10_Linux comp3 = new C10_Linux(1);
        System.out.println(comp3.os);



    }

}