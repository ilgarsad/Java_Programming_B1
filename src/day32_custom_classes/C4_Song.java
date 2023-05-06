package day32_custom_classes;

public class C4_Song {
    String name;
    double length;
    String artist;
    String genre;

    public C4_Song(String name){
        this.name = name;
    }

    public C4_Song(String name, double length){
//        this.name = name;
        this(name);
        this.length = length;
    }

    public C4_Song(String name, double length, String artist) {
//        this.name = name;
//        this.length = length;
        this(name, length);
        this.artist = artist;
    }

    public C4_Song(String name, double length, String artist, String genre) {
//        this.name = name;
//        this.length = length;
//        this.artist = artist;
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
