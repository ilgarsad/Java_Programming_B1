package day21_arrays;

import java.util.Arrays;

public class C2_ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[5];
//        arr [5] = 30;       //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = new int[3];
        System.out.println(Arrays.toString(arr2));

        boolean [] arr3 = new boolean[2];
        System.out.println(Arrays.toString(arr3));

        String [] arr4 = new String[4];
        System.out.println(Arrays.toString(arr4));

        System.out.println("--------------------");

        arr [0] = 10;
        System.out.println(arr[0]);

        arr [1] = 23.3;

        System.out.println(Arrays.toString(arr));

        arr [2] = -44.4;
        arr [3] = 100;
        arr [4] = 200;

        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------");

        String [] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};
        System.out.println(Arrays.toString(cities));
        cities [5] = "GaithBurg";
        System.out.println(Arrays.toString(cities));

        arr = new double[8];
        System.out.println(Arrays.toString(arr));

    }
}
