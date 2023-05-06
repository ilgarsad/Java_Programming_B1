package day37_a_abstraction.exercise;

public abstract class C7_Exercise {

    final String name;

    public C7_Exercise(String name){
        this.name = name;
    }

    public abstract void performExercise();

    public abstract int getCaloriesBurned(int minutes);

}
