package day37_a_abstraction.cars;

import day37_a_abstraction.cars.C2_Toyota;
import day37_a_abstraction.cars.C3_Honda;
import day37_a_abstraction.cars.C5_Tesla;

public class C6_Garage {
    public static void main(String[] args) {

//        Car obj1 = new Car();  Car is abstract, so we cannot make an object of this class

        C2_Toyota obj2 = new C2_Toyota();
        obj2.start();

        System.out.println();

        C3_Honda obj3 = new C3_Honda();
        obj3.start();

        // Both Toyota and Honda were concrete classes, because they were not abstract, so we had to implement the start method

//        ElectricCar obj4 = new ElectricCar(); ElectricCar is abstract, so we cannot create an object of this class

        System.out.println();

        C5_Tesla obj5 = new C5_Tesla();
        obj5.start(); // defined in the Car class
        obj5.charge(); // defined in the ElectricCar class

        // Tesla was a non-abstract class, so it was concrete, which mean it had to override all the abstract methods from the super classes

    }
}
