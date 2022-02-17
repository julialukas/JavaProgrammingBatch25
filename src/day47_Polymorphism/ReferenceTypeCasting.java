package day47_Polymorphism;

import day42_Exceptions.EmployeeTask.Employee;
import day42_Exceptions.EmployeeTask.Tester;
import day44_Interface.AnimalTask.Animal;
import day44_Interface.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Shape;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Shape shape = new Circle(4);

        Shape shape2 = new Circle(7);

        System.out.println(shape);


        Animal animal = new Dog("Ace","Siberian Husky",'M',5,"Medium","White");

        ((Dog) animal).bark();
        System.out.println("------------------------------------------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",132000);

        ((Tester)employee).bugReport();


    }
}
