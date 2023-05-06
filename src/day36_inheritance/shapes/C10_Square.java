package day36_inheritance.shapes;

import day36_inheritance.shapes.C9_Shape;

public class C10_Square extends C9_Shape {

    double side;

    public C10_Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public double area(){
        return side * side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                '}';
    }
}
