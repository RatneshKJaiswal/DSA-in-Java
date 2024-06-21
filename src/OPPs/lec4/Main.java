package OPPs.lec4;

public class Main {
    public static void main(String[] args) {
        A obj =new A(34, "Ratnesh");

        // Access and modify the data members

        System.out.println(obj.getNum());   // this is allowed

        //  obj.num = 10;       This is not allowed because num is itself private, thus we can only access its
        //                      properties via function and not directly
        /*

            Access Scope :-
            Public - Class, Package, SubClass(same pkg), SubClass(diff pkg), World(Outside package)
            protected - Class, Package, SubClass(same pkg), SubClass(diff pkg)
            default - Class, Package, SubClass(same pkg)
            private - Class

            here subclass means extended (inherited class)

         */

        /*

            Types of packages :-

            1. In-Built Package :-
                    a. lang package (automatically imported) - java essential stuff
                    b. IO - Input Output
                    c. util - data structure
                    d. applet - server rendering
                    e. awt - graphics
                    f. net - networking

         */
    }
}
