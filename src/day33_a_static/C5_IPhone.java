package day33_a_static;

public class C5_IPhone {
    String model;
    double price;

    static String company;
    static String os;
    static boolean appleDay;
    static String day;

    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";
        day = "Wednesday";

        if(day.equals("Friday")){
            appleDay = true;
        }

    }

    public C5_IPhone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
