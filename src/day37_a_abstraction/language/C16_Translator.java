package day37_a_abstraction.language;

public class C16_Translator {
    public static void main(String[] args) {

        //Language obj = new Language(); cannot create objects of interface

        C14_Spanish spanish = new C14_Spanish();
        spanish.hi();
        spanish.bye();

        C15_Turkish turkish = new C15_Turkish();
        turkish.hi();
        turkish.bye();

        System.out.println(C13_Language.PLANET);

    }
}
