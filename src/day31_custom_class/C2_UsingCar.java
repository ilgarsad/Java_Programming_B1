package day31_custom_class;

public class C2_UsingCar {
    public static void main(String[] args) {

        C1_Car carOne = new C1_Car();
        C1_Car carTwo = new C1_Car();

        carOne.model = "Volvo";
        carOne.year = 2023;
        carOne.color = "Silver";
        carOne.fuelLevel = 80;

        System.out.println(carOne);
        //System.out.println(carTwo);

        carOne.fillTank();
        System.out.println("-------");
        System.out.println(carOne);

        carOne.fillTank(50);
        System.out.println(carOne);
    }
}