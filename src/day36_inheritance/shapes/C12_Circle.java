package day36_inheritance.shapes;

import day36_inheritance.shapes.C9_Shape;

public class C12_Circle extends C9_Shape {

    double radius;

    public C12_Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
