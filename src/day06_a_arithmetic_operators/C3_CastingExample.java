package day06_a_arithmetic_operators;

public class C3_CastingExample {

    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;

        char letter = 'A';
        int letter2 = letter;
        System.out.println(letter2);

        System.out.println();

        float num2 = 100.5F;
        short num4 = (short)num2;
        System.out.println(num4);

        char name = 'A';
        System.out.println(name);

        int num = 'A';
        System.out.println(num);
    }
}
