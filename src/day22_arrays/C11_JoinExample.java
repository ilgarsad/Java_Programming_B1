package day22_arrays;

import java.util.Arrays;

public class C11_JoinExample {
    public static void main(String[] args) {

        String [] str = {"a",  "b", "c"};
        System.out.println(Arrays.toString(str));

        System.out.println(String.join("<>", str));
        System.out.println(String.join("----", str));
        System.out.println(String.join("****", str));
        System.out.println(String.join(" ", str));
        System.out.println(String.join("", str));




    }
}
