package day35_inheritance.book;

public class C4_Library {
    public static void main(String[] args) {

        C1_Book book = new C1_Book();
        // this book object can reach 6 instances
        // book.size = 23;
        // book.duration = 45;

        C3_EBook ebook = new C3_EBook();
        // this ebook object can reach 6 instance variables from SUPER class and 2 instance variables and 1 instance method from its own class
        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft Skill";
        ebook.author = "Nadir";
        ebook.read();


        C2_AudioBook abook = new C2_AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Morgan Freemon";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();

    }

}