package day33_a_static;

import java.util.ArrayList;

public class C17_UsingSong {
    public static void main(String[] args) {
        C16_Song song1 = new C16_Song("Waka waka", 3.2);
        C16_Song song2 = new C16_Song("Yesterday", 3.1, "Beatles");
        C16_Song song3 = new C16_Song("Here without you", 3.0, "Ruslan", "Rock");

        ArrayList <C16_Song> songlist = new ArrayList<>();
        songlist.add(song1);
        songlist.add(song2);
        songlist.add(song3);

        System.out.println(songlist);
        for (C16_Song each: songlist) {
            System.out.println("--------------");
            System.out.println(each);
        }
        System.out.println("*********************");
        // can you remove the object which does not have genre
        songlist.removeIf(each -> each.genre == null);
        System.out.println(songlist);

        songlist.add(song1);
        songlist.add(song2);

        // can you remove the object which has length longer than 3.1
        System.out.println("*********************");
        songlist.removeIf(each -> each.length > 3.1);
        System.out.println(songlist);
    }
}
