package Function;

import java.util.Arrays;

public class varArgs {
    // variable length arguments
    public static void main(String[] args) {
        fun(3,5,1,66,32,11,764,2);
        mul(22, 34, 'c','d','w','a','g','y','n');
    }

    static void fun(int ...var){
        // by using this type of variable we can input n number of arguments in  the function
        // an array of homogeneous type is created internally
        System.out.println(Arrays.toString(var));

    }

    static void mul(int a, int b, char ...c){
        // Variable length argument should always be in last of the function declaration
        System.out.println(a*b);
        System.out.println(Arrays.toString(c));
    }
}
