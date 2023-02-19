package day06_a_arithmetic_operators;

/*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

public class House {

    public static void main(String[] args) {

        String houseType = "Single House";
        byte numberOfBedrooms = 4;
        double numberOfBathrooms = 3.5;
        byte numberOfKitchen = 1;
        boolean basement = true;
        boolean attic = true;
        boolean pool = false;
        boolean houseForSale = false;
        double houseCost = 550_000.00;
        String address = "123 Main Ave";
        int zipcode = 12345;
        boolean hasPark = true;
        double schoolRating = 4.6;

        String houseinfo = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + houseCost + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms " + numberOfBathrooms + " bathroom " + numberOfKitchen + " kitchen " + "\nIt also includes a basement: " + basement + " has an attic " + attic + " has a pool: " + pool + ", is on sale: " + houseForSale + ", and has a park: " + hasPark + "\nThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseinfo);
    }
}
