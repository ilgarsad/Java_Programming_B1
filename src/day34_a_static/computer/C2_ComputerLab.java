package day34_a_static.computer;

public class C2_ComputerLab {
    public static void main(String[] args) {
        //Computer comp1 = new Computer(); // compile time exception
        C1_Computer comp1 = new C1_Computer("HP", 800, "Red");
        System.out.println(comp1.color);


        C1_Computer comp2 = new C1_Computer("Dell", 900, "Grey");
        System.out.println(comp2.color);

        System.out.println("-------------");
        System.out.println(C1_Computer.hasScreen);
        System.out.println(C1_Computer.hasBattery);
        System.out.println(C1_Computer.hasMemory);


        System.out.println("-------------");
        System.out.println(comp1.hasScreen);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasMemory);


        System.out.println("-------------");
        System.out.println(comp2.hasScreen);
        System.out.println(comp2.hasBattery);
        System.out.println(comp2.hasMemory);


        comp1.hasBattery = false;
        System.out.println("**********");
        System.out.println(comp1.hasScreen);
        System.out.println(comp1.hasBattery);
        System.out.println(comp1.hasMemory);
        System.out.println("**********");
        System.out.println(comp2.hasScreen);
        System.out.println(comp2.hasBattery);
        System.out.println(comp2.hasMemory);


    }

}