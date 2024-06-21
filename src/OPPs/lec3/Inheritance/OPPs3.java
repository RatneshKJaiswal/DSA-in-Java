package OPPs.lec3.Inheritance;

public class OPPs3 {

    /**

    Inheritance -> If there is a class which is able to use properties of other class
    Child class can inherit properties / functions of the base class.
    Child class can also have additional functions.

    class Base{
        int age;
        String name;
    }
    class Child extends Base {
        int weight;
    }
    main(){
        Child child = new Child();
        child.age;
        child.name;
        child. weight;
    }

    Here under child class we can access both the methods of child class and base class.


    */

    double l;
    double h;
    double w;

    OPPs3(){

        // super();     if we add super keyword in the main parent file then this will point to object class

        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

    // Cube
    OPPs3(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    OPPs3(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    OPPs3(OPPs3 old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void display(){
        System.out.println("Running the Box");
    }

}

/*
    Types of Inheritance :-

    1. Single Level Inheritance - One parent class and its one child class

    2. Multilevel Inheritance - A is parent of B, B is parent of C, and so on

    3. Multiple Inheritance - One child class is extending more than one class
                              This is not supported in java because if in case both the parent class have same
                              variable then a conflict will occur.
                              But we can do this via interfaces.

    4. Hierarchical Inheritance - One parent can have multiple children

    5. Hybrid Inheritance - Combination of single and multiple inheritance
                            Not available in java (can be done by interface)

 */