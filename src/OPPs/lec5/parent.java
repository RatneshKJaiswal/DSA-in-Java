package OPPs.lec5;

public abstract class parent {

    // If we definitely know that the function is going to be overridden then instead of creating the whole body
    // declare them as abstract.

    // We cannot use object of the abstract class
    // We cannot create abstract constructors
    // Static and normal functions can be created in abstract class
    // Final classes cannot be inherited thus there is no sense of using abstract with it
    // Multiple inheritance is not allowed with abstract classes also.

    abstract void career(String name);
    abstract void partner(String name, int age);
}
