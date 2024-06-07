package Strings;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 124.5674f;
        System.out.printf("Formated number is %.2f \n", a);
        System.out.printf("Formated value of PI is %.3f \n",Math.PI);

        // println calls a toString method to concat two or more segments into a single string
        System.out.println("Ratnesh " + new Integer(11417));  // string is concatenated with an object

//        System.out.println(new Integer(43) + new ArrayList<>());
//        This will not work as for + operation at least one should be string, this only work for primitives

    }
}
