package day38_a_abstraction.animal;

import day38_a_abstraction.language.Language;

public class C4_Parrot extends C3_Bird implements C5_Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrots chews the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }


    @Override
    public void hi() {
        System.out.println("Gu gu");
    }

    @Override
    public void bye() {
        System.out.println("Ba ba");
    }
}