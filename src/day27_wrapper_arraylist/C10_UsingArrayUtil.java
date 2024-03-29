package day27_wrapper_arraylist;

import my_util.ArrayUtil;

import java.util.Arrays;

public class C10_UsingArrayUtil {
    public static void main(String[] args) {
        ArrayUtil.addElemBeginning(34, 23, 345, 23, 213, 213);
        System.out.println(ArrayUtil.addElemBeginning(12, 45, 76, 5678, 34));

        int [] nums = {23, 564, 78, 90, 90};
        int addNum = 45645;

        System.out.println(Arrays.toString(ArrayUtil.addElemBeginning(addNum, nums)));

        String [] allWords = {"hello", "Tom", "Jerry"};
        String word = "World";

        System.out.println(Arrays.toString(ArrayUtil.addElemBeginning(word, allWords)));
    }
}
