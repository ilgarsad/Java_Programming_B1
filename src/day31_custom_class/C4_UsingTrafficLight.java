package day31_custom_class;

public class C4_UsingTrafficLight {
    public static void main(String[] args) {

        C3_TrafficLight lightOne = new C3_TrafficLight();
        lightOne.color = "Red";  // Initializing the instance variable
        System.out.println(lightOne.color);

        C3_TrafficLight lightTwo = new C3_TrafficLight("Green");
        System.out.println(lightTwo.color);

        C3_TrafficLight lightThree = new C3_TrafficLight("Yellow");
        System.out.println(lightThree.color);

        C3_TrafficLight lightFour = new C3_TrafficLight();
        C3_TrafficLight lightFive = new C3_TrafficLight();
        System.out.println(lightFour.color);
        System.out.println(lightFive.color);
    }
}