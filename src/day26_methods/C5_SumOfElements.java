package day26_methods;

public class C5_SumOfElements {

    // varargs --- > variable arguments

    public static void main(String[] args) {
        int [] arr = {12, 34, 23, 12, 65};
        int [] arr2 = new int [] {34, 23, 456, 756};

        System.out.println(sumOfElements(arr));
        System.out.println(sumOfElements(arr2));
        System.out.println(sumOfElements(new int[] {12, 34, 56, 786, 78}));

        System.out.println(sumOfElements2(1, 2, 3, 4, 5));

        System.out.println(method(23, 45, 54, 4 ));
        System.out.println(method("Hello", 45, 54, 4 ));

    }

    public static int sumOfElements (int [] arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;
        }
        return sum;
    }
        // create a method which accepts an int array and returns the sum of the elements.

    public static int sumOfElements2 (int ... arr) {
        int sum = 0;

        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

    public static int method (int num, int ... arr) {
        return 1;
    }

    public static int method (String str, int ... arr) {
        return 2;
    }

    // varargs has to be at the end in the paranthesis
//    public static int method (int ... arr, int num) {
//        System.out.println("Testing varargs");
//        return 1;
//    }



    //      We can NOT return it like this. It is only valid in the method paranthesis
//    public static int ... arr method (int num, int ... arr) {
//        System.out.println("Testing varargs");
//    }

}
