package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String word = "    Java is a great language    ";
        System.out.println(word);

        word = word.trim();     // "Java is a great language"
        System.out.println(word);

//        word = word.substring(0, 4);
        word = word.substring(0, word.indexOf(" "));
        System.out.println(word);

        System.out.println("-----------------------");
        word = "    Java is a great language    ";
        System.out.println(word);


//        String word2 = word.trim().substring(0, 4).toLowerCase().toUpperCase().contains("ja");
        String word3 = word.trim().substring(0, 4).toLowerCase().toUpperCase();
        System.out.println(word);

    }
}
