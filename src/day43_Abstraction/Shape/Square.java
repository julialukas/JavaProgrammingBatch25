package day43_Abstraction.Shape;

import day43_Abstraction.Shape.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }


    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side<=0){
            throw new RuntimeException("Invalid entry "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
}