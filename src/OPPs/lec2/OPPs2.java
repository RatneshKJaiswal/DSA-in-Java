package OPPs.lec2;

public class OPPs2 {
    public static void main(String[] args) {
        /**

        Packages are the containers of classes. It is used to keep classes in compartments.
        We define class inside package as, package <folder name>.<sub-folder name>.<class name>

        Package is folder containing classes, thus when we want to access those classes/functions of classes.
        we use, import static <folder name>.<sub-folder name>.<class name>.<function name>

        example :- if we want to create to folders with same name then we generally do it by creating
                   them in two different folders/packages.

        Those classes while which the not in same package type, it's functions only with public access will be
        allowed to be accessed

        static variable -> we use static variable when we need an object independent variable inside the constructor
        e.g. Class Human{
                int age;
                String name;
                boolean married;
                static int population;

                Human(int age, String name, boolean married){
                    this.age = age;
                    this.name = name;
                    this.married = married;
                    this.population += 1;
                }
            }

            Here population will keep on increasing when a new object is created with diff values of name and age
            which get reset but population being static is not reset.
            Using 'this' keyword works hear but by convention instead of using " this.population / <obj name>.population "
            use " <class name>.population "

            Thus, we can say that we can access the static variable without actually creating an object for it.
            we can also create static method.

        Q. Why we use static with main function?
        -> As by using static variable we can access the function without creating the object of it and to create an
            object we need a method call by another method, and that method will also require a method call, thus we
            need a method as our starting point which need to called directly during runtime, that method is main method
            using static variable.

        Inside a static method we cannot use any non-static element.

        'this' keyword cannot be used in static method as it's used for object based operations

         */

        fun();      // static call possible in static method
    }

    // this method is not dependent on objects
    static void fun(){
        //greeting();     // you can't use this because it requires an instance/objects
                        // but function you are using it in doesn't depend on instances

        OPPs2 obj = new OPPs2();
        obj.greeting();

    }

    // Something that is non-static belong to an object
    // to run a non-static method we need to create an object
    void greeting(){
        //fun(); // but we can define static member inside a non-static member
        System.out.println("Hiiiii");
    }
}
