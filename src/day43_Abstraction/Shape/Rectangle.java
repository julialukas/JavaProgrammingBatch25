package day43_Abstraction.Shape;

import day43_Abstraction.Shape.Shape;

public class Rectangle extends Shape {

    private double l, w;


    public Rectangle( double l, double w) {
        super("Rectangle");
        setL(l);
        setW(w);

    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if(l<=0){
            throw new RuntimeException("Invalid entry "+l);
        }

        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if(w<=0){
            throw new RuntimeException("Invalid entry "+w);
        }
        this.w = w;
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }
}