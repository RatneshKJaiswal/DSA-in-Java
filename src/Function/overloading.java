package Function;

public class overloading {

    // Method overloading based on functions with same name but different parameters
    public static void main(String[] args) {
        fun(34,22);
        fun('j');
    }

    static void fun(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void fun(char ch){
        System.out.println(ch);
    }
}
