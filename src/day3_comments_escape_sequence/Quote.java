package day3_comments_escape_sequence;

public class Quote {
    public static void main (String [] args) {
        //The below code prints this quote -> I like "Java" programming.
        System.out.println("I like \"Java\" Programming");

        //Can you print " for me?
        System.out.println("\"");

        //How can I print the backsplash ---> \itself?
        System.out.println("\\");

        //To print out to backslashes
        System.out.println("\\\\");

        //To print out to single quote
        System.out.println("\'");
    }
}
