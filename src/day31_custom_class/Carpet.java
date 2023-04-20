package day31_custom_class;

public class Carpet {
    // have instance variables: width, length, isPersian, unitPrice, totalPrice
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet (double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian) {

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;

        calculatePrice();

    }

    public void calculatePrice () {
        totalPrice = width * length * unitPrice;

        if (isPersian) {
            totalPrice += 1000;
        }
    }

    @Override
    public String toString() {
        return "Carpet: " +
                "\nwidth: " + width +
                "\nlength: " + length +
                "\nisPersian: " + isPersian +
                "\nunitPrice: " + unitPrice +
                "\ntotalPrice: $" + totalPrice;
    }
}
