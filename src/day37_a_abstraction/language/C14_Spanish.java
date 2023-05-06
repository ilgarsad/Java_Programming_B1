package day37_a_abstraction.language;

public class C14_Spanish implements C13_Language {

    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}

