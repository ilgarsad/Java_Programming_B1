package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingSong {
    public static void main(String[] args) {
        Song song1 = new Song("Waka waka", 3.2);
        Song song2 = new Song("Yesterday", 3.1, "Beatles");
        Song song3 = new Song("Here without you", 3.0, "Ruslan", "Rock");

        ArrayList <Song> songlist = new ArrayList<>();
        songlist.add(song1);
        songlist.add(song2);
        songlist.add(song3);

        System.out.println(songlist);
        for (Song each: songlist) {
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
