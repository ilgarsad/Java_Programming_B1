package day33_a_static;

public class C15_Road {
    public static void main(String[] args) {

        C14_TrafficLight light = new C14_TrafficLight("grey");
//        System.out.println(light.color);
//
//        light.color = "pink";

        C14_TrafficLight light2 = new C14_TrafficLight("red");
        System.out.println(light2.getColor());

        light2.setColor("grey");

        System.out.println(light2.getColor());

        C14_TrafficLight light3 = new C14_TrafficLight("Black");
        System.out.println(light3.getColor());

    }
}
