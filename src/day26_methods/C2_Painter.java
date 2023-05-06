package day26_methods;

public class C2_Painter {
    public static void main(String[] args) {
        C1_Picture.draw();
        C1_Picture.draw(45);
        C1_Picture.draw("Black", "White");

        int num = 6;
        String str = "Test";
        C1_Picture.draw(str, num);
        C1_Picture.draw(num, str);
    }
}
