package day46_Polymorphism.Practice;

public class Cube extends Shape implements Volume{
    public Cube() {
        super("Cube");
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
