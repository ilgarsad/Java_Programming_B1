package day17_loops;

public class C8_CountLetters {
    public static void main(String[] args) {

        String word = "aabbcca";
        char letter = 'a';

        int countOfLetterA = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                countOfLetterA++;
            }
        }

        System.out.println("Count of letter a is: " + countOfLetterA);

    }
}
