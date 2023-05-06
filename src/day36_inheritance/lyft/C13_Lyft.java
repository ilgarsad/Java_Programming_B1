package day36_inheritance.lyft;

public class C13_Lyft {

    String driver;

    public C13_Lyft(String driver){
        this.driver = driver;
    }

    public double calculateRate(int miles){
        return miles * 1.50;
    }
}
