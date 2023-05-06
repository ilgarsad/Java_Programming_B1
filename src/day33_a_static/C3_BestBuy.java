package day33_a_static;

public class C3_BestBuy {
    // if we do not have object we can not reach the instance variables.
    String location;

    static String headQuarters = "Richfield, MN. USA";
    static String day = "Sunday";
    static int numOfComputer = 100;

    public C3_BestBuy(String location){
        this.location = location;
    }
}
