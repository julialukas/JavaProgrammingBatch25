package day45_Abstraction.Shape;

public abstract class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public double area(){
        return width * length;
    }
}
