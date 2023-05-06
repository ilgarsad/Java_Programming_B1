package day30_b_custom_classes;

public class C12_Animal {

    String species;
    long population;

    public void fly () {
        System.out.println(species + " are flying ");
    }


    public String toString () {
        String print  ="Species " + species + "\nPopulation " + population;

        return print;
    }

}
