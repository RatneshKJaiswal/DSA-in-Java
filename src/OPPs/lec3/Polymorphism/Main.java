package OPPs.lec3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        triangle tri = new triangle();

        shape.area();
        circle.area();
        tri.area();

        // obj of shapes contains the function area which got override by area of triangle function
        // overriding occurs when reference variable is of parent class and object is of child class
        // This process is called upcasting.
        // Object type define which one to run, Reference type defines which one to access
        shapes obj = new triangle();
        obj.area();
    }
}

/*
        Poly - many
        morphism - represent

        Polymorphism means many ways to represent a single element

        Types of Polymorphism :-

        1. Compile time / Static Polymorphism -> Achieved via method overloading
                                                 e.g. Multiple constructor

        2. Dynamic / Runtime Polymorphism -> Achieved via method overriding
                                             e.g. let a parent class have int method fun
                                                  and b child of a have int method fun
                                                  then fun of a will be over ride by the fun of b.

        How java do dynamic polymorphism?
         -> By Dynamic Method Dispatch
         But in case we define function of parent class as 'final' then we will not be able to override it.
         Compile time resolve - early binding
         Runtime resolve - late binding

         We cannot override (overriding depends on object) static method but can be inherited.

     */