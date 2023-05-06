package day33_a_static;

public class C16_Song {
    // data: name, length, artist, genre
    String name;
    double length;
    String artist;
    String genre;

    // Constructors: name-Length | name - length - artist | name-length-artist-genre
    public C16_Song(String name, double length){
        this.name = name;
        this.length = length;
    }
    public C16_Song(String name, double length, String artist){
//        this.name = name;
//        this.length = length;
        this(name, length);
        this.artist = artist;
    }
    public C16_Song(String name, double length, String artist, String genre){
//        this.name = name;
//        this.length = length;
//        this.artist = artist;
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song" +
                "\nName: " + name +
                "\nLength: " + length +
                "\nArtist: " + artist +
                "\nGenre='" + genre;
    }
}
