package day23_multidimensional_arrays;

import day22_arrays.ArrayToString;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "amazon";
        String env = "us-east-1,us-west-1,us-west-2,us-west-3";

        String [] envArray = env.split(",");   // 4 elements
//        System.out.println(Arrays.toString(envArray));

//        for (int i = 0; i < envArray.length; i++) {
//            System.out.println(app + " is being deployed to the environment " + envArray[i]);
//        }

        for (String eachEnv : envArray) {
            System.out.println(app + " is being deployed to the environment " + eachEnv);
        }

    }
}
