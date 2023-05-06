package day38_b_polymorphism.animal;

public class C19_Wild {
    public static void main(String[] args) {

        // all possible reference/object of Lizard

        // itself
        C18_Lizard lizard = new C18_Lizard();
        lizard.eat();
        lizard.name = "lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);
        System.out.println();

        // super class - reptile
        C17_Reptile reptile = new C18_Lizard();
        reptile.eat();
        reptile.name = "lizard";
        reptile.numberOfClaws = 10;
//        reptile.skinColor = "camo"; // Reptile reference does not have access to skinColor variable
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
//        System.out.println(reptile.skinColor); // Reptile reference does not have access to skinColor variable
        System.out.println();

        // super class - animal
        C16_Animal animal = new C18_Lizard();
        animal.eat();
        animal.name = "lizard";
//        animal.numberOfClaws = 10;// Animal reference does not have access to numberOfClaws variable
//        animal.skinColor = "camo"; // Animal reference does not have access to skinColor variable
        System.out.println(animal.name);
//        System.out.println(animal.numberOfClaws); // Animal reference does not have access to numberOfClaws variable
//        System.out.println(animal.skinColor); // Animal reference does not have access to skinColor variable
        System.out.println();

        /*

            We made 3 Lizard objects with 3 different references:
            Lizard (itself), Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run

         */

    }
}