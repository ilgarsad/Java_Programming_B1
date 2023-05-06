package day32_custom_classes;

public class C5_UseSong {

    public static void main(String[] args) {

        C4_Song song1 = new C4_Song("waka waka");
        System.out.println(song1);

        C4_Song song2 = new C4_Song("viva la vida", 3.5);
        System.out.println(song2);

        C4_Song song3 = new C4_Song("Thriller", 4.0, "Michael Jackson", "Pop");
        System.out.println(song3);


    }


}
