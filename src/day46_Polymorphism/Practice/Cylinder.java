package day46_Polymorphism.Practice;

public class Cylinder extends Shape implements Volume{
    public Cylinder(String cube) {
        super(cube);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
