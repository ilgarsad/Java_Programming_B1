package day35_inheritance.book;

public class C2_AudioBook extends C1_Book {

    double duration;
    String narrator;

    public void listen() {
        System.out.println("Listening the audio book " + title + " by " + author);
    }



}