package day16_loops;

public class C5_Factorial {
    public static void main(String[] args) {

        //Q: What is factorial 4?
        //A: 4! = 4*3*2*1

        int num = 5;
        int result = 1;

        while (num > 1){
            System.out.println(result + " * " + num);
            result *= num;
            num--;
        }

        System.out.println(result);




    }
}
