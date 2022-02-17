package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume {

    public Cylinder(String name) {
        super(name);
    }

    public Cylinder() {
        super("Cylinder");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}

/*
V=πr2h
radius * height
 */