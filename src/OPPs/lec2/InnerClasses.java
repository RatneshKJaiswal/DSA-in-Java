package OPPs.lec2;

public class InnerClasses {

    /**
     Inner classes can be static
     Inner class with static doesn't depend on objects of outer class but can have instances of itself
     Thus it have multiple object exhibiting multiple values, here main and Test can depend on each other
    */
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        This is possible only when we use static with the inner class else it will show error
//        as Test class without static will be dependent on the main class for object creation
        Test a = new Test("Ratnesh");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}

/**

Outside Classes cannot be static as it is not dependent on any other class

static class A{

}

 */
