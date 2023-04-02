package day17_loops;

public class PrintEaachChar {
    public static void main(String[] args) {

        String str = "java is great language";
        //            0123

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println("--------------");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            
        }

    }
}
