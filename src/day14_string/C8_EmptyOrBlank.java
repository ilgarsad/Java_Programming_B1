package day14_string;

public class C8_EmptyOrBlank {
    public static void main(String[] args) {

        String word1 = "last minutes";
        System.out.println(word1.isEmpty());    //false

        word1 = "";
        System.out.println(word1.isEmpty());    //true

        word1 = " ";
        System.out.println(word1.isEmpty());    //false
        System.out.println(word1.isBlank());    //true

        word1 = "      ";
        System.out.println(word1.isEmpty());    //false
        System.out.println(word1.isBlank());    //true

        word1 = "   y    ";
        System.out.println(word1.isEmpty());    //false
        System.out.println(word1.isBlank());    //false
    }
}
