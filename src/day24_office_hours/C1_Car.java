package day24_office_hours;

public class C1_Car {

    public static void unlockCar () {
        System.out.println("Unlocking the car");
    }

    public static void openDoor () {
        System.out.println("Opening the door");
    }

    public static void getInCar () {
        System.out.println("Getting in the car");
        System.out.println("Closing the door");
    }

    public static void getReadyToGo () {
        System.out.println("Putting a seatbelt");
        System.out.println("Checking mirrors");
        System.out.println("Put a music on");
        System.out.println("Put on a navigation");
    }

    public static void startCar () {
        System.out.println("Starting a car");
    }

    public static void getReady (){
        System.out.println("Putting gear into drive mode");
        System.out.println("Start driving");
    }

    public static void startToDrive () {
        unlockCar();
        openDoor();
        getInCar();
        getReadyToGo();
        startCar();
        getReady();

    }

    public static void main(String[] args) {
        startToDrive();
        System.out.println("-----");
        openDoor();
    }



}
