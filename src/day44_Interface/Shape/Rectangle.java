package day44_Interface.Shape;

public class Rectangle extends Shape {

    public double width;
    public double length;

    @Override
    public double area(){
        return width * length;
    }
}
