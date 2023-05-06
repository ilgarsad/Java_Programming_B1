package day36_inheritance.lyft;

import day36_inheritance.lyft.C13_Lyft;

public class C14_LyftXL extends C13_Lyft {

    public C14_LyftXL(String driver){
        super(driver);
    }

    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles) * 1.1;
    }

    // super.calculateRate() calls the method in the Lyft class, parent class, then we multiply 1.1 to that result

}
