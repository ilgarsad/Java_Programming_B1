package day06_b_unary_operators;

public class C11_Letters {
    public static void main(String[] args) {

        // Task: define a character. print me the next four characters on new lines

        char letter = 'G';
        System.out.println("Original " + letter++);

        System.out.println("Next four: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);


    }
}
