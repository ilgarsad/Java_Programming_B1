package day26_methods;
/*
Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */
public class C8_ContainsArray {

    public static boolean containArr (int[] arr, int num) { // [2, 4, 6, 8, 9, 10], 4

//        boolean result = false;

        for (int each : arr) {
            if (each == num) {
                return true;
//                result = true;
//                break;
            }
        }
        return false;
//        return result;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 66, 81};
        int num = 66;

        System.out.println(containArr(arr, num));
        System.out.println(containArr(new int [] {1, 2, 3}, 4));
        System.out.println(containArr(new int [] {1, 2, 3}, 3));
    }
}
