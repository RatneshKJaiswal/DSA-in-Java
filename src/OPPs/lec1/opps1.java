package OPPs.lec1;

public class opps1 {
    public static void main(String[] args) {
        // just say we need to have a set of student details [roll , name , marks]
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        /*

         but if we need to have these in same entity then we need to create a class / set of functions and objects
         inorder to create a module for the same

         Object of the class --> instance of a class / that means they are copy of class template having diff. value

         if car is a class then bmw , audi , mercedes are object with diff. values of feature by same features like
         engine , tyres , seats but no. of them can vary from object to object

         class --> logical construct
         object --> physical reality -> occupy space in the memory

         Properties of the Object :-
         1. State -> Value
         2. Identity -> where the value is stored
         3. Behaviour -> Operations performed

         Objects are stored in heep memory.

         why don't we use new keyword for creating primitives?
         -> This because primitives are created during compile time in stack memory and not in heep memory

         Student[] students = new Student[5];

         dot operator -> to access the content inside the class
         new keyword -> to create object in heep

         */

        /*

         Student std; -> reference to the object in stack memory -> created during compile time
         std = new Student(); -> now we need to initialize the object in the heep by using new keyword -> created during run time

         what is Student() -> This is a constructor of class Student, here it is a default constructor used to bind the arguments
                              inside the class with the object
        */

//        Student std = new Student();
//        std.roll = 12;
//        std.name = "Raj";
//        std.marks = 98.5f;
//
//        System.out.println(std.marks);

          Student abc = new Student();      // this will call the constructor with no parameter
          System.out.println(abc.roll);
          System.out.println(abc.marks);
          System.out.println(abc.name);

          abc.changeName("Antony");

          abc.greeting();

          Student xyz = new Student(19, "Ratnesh", 98.5f);
        System.out.println(xyz.roll);
        System.out.println(xyz.marks);
        System.out.println(xyz.name);

        // ljp will take value from abc object
        Student ljp = new Student(abc);
        System.out.println(ljp.roll);
        System.out.println(ljp.marks);
        System.out.println(ljp.name);

        /*

        Student one = new Student();
        Student two = one;

        in the heap memory a memory allocation will be provided to object one
        as object two = one thus it will also point to the same memory allocation.

         */

        Student one = new Student();
        Student two = one;
        one.name = "one name";
        System.out.println(two.name);

    }

}

// Creation of a class
class Student{
    int roll;
    String name;
    float marks;


//      Constructor :-
//      this keyword -> this keyword is used to directly assign value to the object argument inside constructor / class
    Student(){
          this.roll = 13;
          this.name = "Kumar";
          this.marks = 84.5f;
    }
    // 'this' keyword is generally used when we need common element values in each object
    void greeting(){
          System.out.println("I am "+this.name);
    }

    void changeName(String newName){
        name = newName;
    }


    // Constructor overloading due to same named function with different parameter
    Student(int roll, String naam, float mark){
        this.roll = roll;
        this.name = naam;
        this.marks = mark;
    }

    // this.name will be replaced by ljp.name and other.name is replaced with abc.name
    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.roll = other.roll;
    }

    /*

     Student(){
        this (16, "Rohan", 74.9f);
     }

     this is how you call a constructor from another constructor
     here, this keyword will be replaced by Student as required to call another constructor.

     */

}
