package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class C12_Store {
    public static void main(String[] args) {

/*
    try making an array of Food objects
    find all the Food objects that start with 'a'
    find all the Food objects that have a total price over 20
*/

        C11_Food food1 = new C11_Food("Apple");
        C11_Food food2 = new C11_Food("Grape", 4);
        C11_Food food3 = new C11_Food("Banana", 10, 2.99);


        // If we want ot add it to array
        C11_Food[] foodArr = {food1, food2, food3};

        ArrayList <C11_Food> foodList = new ArrayList <>();
        foodList.addAll(Arrays.asList(foodArr));


        for (int i = 0; i < foodList.size(); i++) {

            if (     (foodList.get(i).name.charAt(0)+"").equalsIgnoreCase("a")    ) {
                System.out.println(foodList.get(i));
            }

        }



    }


}