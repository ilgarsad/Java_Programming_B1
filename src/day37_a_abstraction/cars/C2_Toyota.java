package day37_a_abstraction.cars;

import day37_a_abstraction.cars.C1_Car;

public class C2_Toyota extends C1_Car {

    @Override
    public void start(){
        System.out.println("Insert a key");
        System.out.println("Start the car by turning the key");
    }


}