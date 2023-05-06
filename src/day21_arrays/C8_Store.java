package day21_arrays;

public class C8_Store {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "Hat", "Dress", "Sunglasses"};
        boolean hasHat = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("hat")){
                hasHat = true;
//                System.out.println("Hat item is available.");     ---> We can do this too. But in this case we can not handle out of stock option.
                break;
            }

        }
        if (hasHat){
            System.out.println("Hat item is available.");
        } else {
            System.out.println("Hat is out of stock.");
        }

        //This is just extra to recap ternary
        System.out.println(hasHat ? "Hat item is available." : "Hat is out of stock.");

    }
}
