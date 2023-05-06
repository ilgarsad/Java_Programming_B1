package day37_a_abstraction.cars;

import day37_a_abstraction.cars.C1_Car;

public abstract class C4_ElectricCar extends C1_Car {

    public abstract void charge();


}

/*

    the ElectricCar class is a sub class of the Car class

    the Car class was abstract and ElectricCar is also abstract

    abstract class can have abstract methods

    so, there is no problem to inherit and we don't need to override any method in this class

 */