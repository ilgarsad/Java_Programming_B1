package day32_custom_classes;

public class C3_Offer {


    // location, company, salary, is full time, number of PTO
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;



/*
    - constructor

        - create a constructor that creates an Offer object with the company and location

        - create a constructor that creates an Offer object with the company, location, and salary

        - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

*/

    public C3_Offer(String company, String location){
        this.company = company;
        this.location = location;
    }

    public C3_Offer(String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public C3_Offer(String company, String location, double salary, boolean isFullTime, int numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }


    @Override
    public String toString() {
        return "Offer: " +
                "\nLocation: " + location +
                "\nCompany: " + company +
                "\nSalary: $" + salary +
                "\n Is Full Time: " + isFullTime +
                "\nNumber Of PTO: " + numOfPTO;
    }
}