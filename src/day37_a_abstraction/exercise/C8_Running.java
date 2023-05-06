package day37_a_abstraction.exercise;

public class C8_Running extends C7_Exercise {

    public C8_Running(){
        super("Running");
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }
}
