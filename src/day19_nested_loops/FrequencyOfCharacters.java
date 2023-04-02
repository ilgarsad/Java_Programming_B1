package day19_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        //             01234
        String checked = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char letter = word.charAt(i);

            if (!checked.contains("" + letter)) {

                for (int j = 0; j < word.length(); j++) {

                    char eachLetter = word.charAt(j);

                    if (letter == eachLetter) {
                        count++;
                    }

                }
                System.out.println(letter + " - " + count);
                checked += letter;
            }
        }
    }
}
