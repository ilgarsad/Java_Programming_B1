package day37_a_abstraction.exercise;

public class C9_Gym {
    public static void main(String[] args) {

//        Exercise obj1 = new Exercise(""); this class is abstract so you can't create an object

        C8_Running obj2 = new C8_Running();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));


    }
}