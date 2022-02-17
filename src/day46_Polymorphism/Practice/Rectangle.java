package day46_Polymorphism.Practice;

public class Rectangle extends Shape {

    public double width;
    public double length;

    public Rectangle(String cube) {
        super(cube);
    }

    @Override
    public double area() {
        return 0;
    }
}
