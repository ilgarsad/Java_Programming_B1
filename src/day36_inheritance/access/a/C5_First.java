package day36_inheritance.access.a;

public class C5_First {

    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;

    public static void main(String[] args) {
        C5_First obj = new C5_First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        System.out.println(obj.four);
    }

}
