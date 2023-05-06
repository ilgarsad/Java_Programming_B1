package day15_string;

public class C11_IndexOfMethod2 {
    public static void main(String[] args) {

        String str = "lopoooooop";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 2));

        System.out.println(str.indexOf("o", str.indexOf("o") + 1));



    }
}
