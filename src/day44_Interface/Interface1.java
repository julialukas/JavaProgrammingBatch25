package day44_Interface;

public interface Interface1 {

    int a = 100; //static and final by default
    void method1(); // method without a body by default is abstract

    static void method2(){ //static method
        System.out.println("static method");
    }
    default void method3(){ //default method
        System.out.println("static method");

    }


}


/*
 * variables are static and final
 * interface can have static methods, abstract methods, and default methods
 * public is the only access modifier that can be used in interface and give by default
 * abstract keyword is given by default to the abstract methods of interface
 *
 * can have static and final variables only
 * static, abstract and default methods only
 *
 * interface is not a class cant have intstance variable or instance methods
 * cannot have a constructor
 * cant have blocks
 *
 * IMPLEMENTS keyword is used to inherit from interfaces
 *
 * when a class implements multiple interfaces it must be implemented
 *
 */
//before Java 8 abstract was the only method that could be given to the interface