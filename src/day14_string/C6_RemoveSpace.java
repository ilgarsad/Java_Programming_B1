package day14_string;

public class C6_RemoveSpace {
    public static void main(String[] args) {

        String day = "    Thursday    ";
        int numOfCharBeforeTrim = day.length();
        System.out.println("numOfCharBeforeTrim = " + numOfCharBeforeTrim);

        day = day.trim();
        int numOfCharAfterTrim = day.length();
        System.out.println("numOfCharAfterTrim = " + numOfCharAfterTrim);


        String msg = "    Today we learned good String methods";
        System.out.println(msg.startsWith("Today"));

        msg = msg.trim();
        System.out.println(msg.startsWith("Today"));
    }
}
