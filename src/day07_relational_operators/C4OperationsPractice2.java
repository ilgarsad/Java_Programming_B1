package day07_relational_operators;

public class C4OperationsPractice2 {

    public static void main(String[] args) {

        int a = 1;
        int b = -a-- + a++ / -a-- * --a;

            //  -1   + 0   / -1   * -1;

        System.out.println(b);
    }
}
