package day36_inheritance.shapes;

public class C9_Shape {

    String name;

    public C9_Shape(String name){
        this.name = name;
    }

    public double area(){
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
