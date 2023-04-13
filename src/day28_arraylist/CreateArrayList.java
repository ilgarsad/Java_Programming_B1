package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Tom");
        list1.add("Jerry");
        System.out.println(list1);

        // We can copy one ArrayList to another one

        ArrayList <String> listTwo = new ArrayList<>(list1);    // here we created a new ArrayList
        System.out.println(listTwo);
        listTwo = list1;    // here we did not create a new ArrayList object, We are just referring to the same one as listOne

        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("Name1", "Name2", "Name3"));
        System.out.println(listThree);

        // ArrayList <String> listFour = new ArrayList<>("Name1", "Name2");  not valid.

    }
}
