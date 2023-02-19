package day3_comments_escape_sequence;

import java.sql.SQLOutput;

public class TabAndNextLine {

    public static void main(String[] agrs) {

        //This is without any tab
        System.out.println("This is not tabbed");

        //This is with one tab
        System.out.println("\tThis is tabbed once");

        //This is with two tabs
        System.out.println("\t\tThis is tabbed twice");

        //Here it is tabbed without escape sequence
        System.out.println("        This is tabbed without escape sequence");

        //Examples of new line
        System.out.println();
        System.out.println("1) Go to parking lot");
        System.out.println("2) Find the car");
        System.out.println("3) Start the car\n");


        System.out.println("1) Go to parking lot \n2) Find the car \n3) Start the car");

        //Command + /   - > Changes all highlighted are to comment and vice versa (for mac)
        //CTRL + /      - > Changes all highlighted are to comment and vice versa(for windows)

    }
}
