package day37_a_abstraction.language;

public class C15_Turkish implements C13_Language {

    @Override
    public void hi(){
        System.out.println("Merhaba");
    }

    @Override
    public void bye(){
        System.out.println("Gule Gule");
    }

}
