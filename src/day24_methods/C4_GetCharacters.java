package day24_methods;

public class C4_GetCharacters {

    public static void printAToZ () {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }

    public static void printaToz () {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printZToA () {
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void printzToa () {
        for (int i = 'z'; i >= 'a'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void print0To9 () {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        printAToZ();
        printaToz();
        printZToA();
        printzToa();
        print0To9();
    }



}
