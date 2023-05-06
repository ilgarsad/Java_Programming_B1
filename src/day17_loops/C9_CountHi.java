package day17_loops;

public class C9_CountHi {
    public static void main(String[] args) {

        String sentence = "aaaaaahiaaaaaahiaaaaahiaaaaahi";
        int countOfHi = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'h' && sentence.charAt(i+1) == 'i') {
                countOfHi++;
            }

        }
        System.out.println("This is the amount of hi you have: " + countOfHi);
    }
}
