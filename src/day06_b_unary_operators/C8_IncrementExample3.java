package day06_b_unary_operators;

public class C8_IncrementExample3 {

    public static void main(String[] args) {

        int i = 5;
        int z = i++;        // z = 5;       i = i+1;    i = 6;

        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1;

        System.out.println(a);
        System.out.println(b);

        int c = ++a;
        System.out.println(c);

        int d = a++;
        System.out.println(d);
        System.out.println(a);
    }
}
