package day22_arrays;

public class C12_ArrayToString {
    public static void main(String[] args) {

        String name = "apple";
        String [] str = name.split("");  // [a, p, p, l, e]
        char [] ch = name.toCharArray();

        char [] ch2 = {'l', 'o', 'o', 'p'};
        String ch2ToStr = new String(ch2);
        System.out.println(ch2ToStr);

        String word = new String("Hello World");
    }
}
