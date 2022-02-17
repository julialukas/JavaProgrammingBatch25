package day43_Abstraction.Shape;

import day43_Abstraction.Shape.Circle;
import day43_Abstraction.Shape.Rectangle;
import day43_Abstraction.Shape.Square;

public class ShapeObjects {
    public static void main(String[] args) {
        //Shape new = new Shape();

        Circle shape1 = new Circle(7.7);
        Rectangle shape2 =  new Rectangle(7.1,4);
        Square shape3 = new Square(7.5);

        System.out.println("shape1 = " + shape1);
        System.out.println(shape2);
        System.out.println(shape3);
    }
}
