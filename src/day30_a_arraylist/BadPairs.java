package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
    {1, 3, 5, 2, 6, 7} ---> which will always have total of given amount
    {5, 2}
 */
public class BadPairs {

    public static ArrayList <Integer> pairs (ArrayList <Integer> list) {

        ArrayList <Integer> goodPairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {

            if (list.get(i) < list.get(i+1)) {
                goodPairs.add(list.get(i));
                goodPairs.add(list.get(i+1));
            }
        }
        return goodPairs;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(nums);
        System.out.println(pairs(nums));
    }

}
