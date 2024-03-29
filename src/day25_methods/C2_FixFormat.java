package day25_methods;
/*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
    Input:
        jamES

    Output:
        James

     */
public class C2_FixFormat {

    public static String fixFormat(String str) {
        String fixed = str.trim();
//        fixed = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
//        return fixed;
        return (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
    }
}
