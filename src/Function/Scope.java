package Function;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // scope begins when the value is initialised

        {
            // a,b can be accessed and modified in the block but can't be re-initialised
            int c=300;
            System.out.println(a+b+c);
        }
        // System.out.println(c); this will give me an error as c is only alive within its block scope
    }
}
