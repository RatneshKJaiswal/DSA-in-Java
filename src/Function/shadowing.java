package Function;

public class shadowing {

    static int x=10; // Global variable

    public static void main(String[] args) {

        System.out.println(x); // global variable is used

        int x=30;
        System.out.println(x); // global variable is overlap by local variable
        xyz();
    }
    static void xyz(){
        System.out.println(x);
    }
}
