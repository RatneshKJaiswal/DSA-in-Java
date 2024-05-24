package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {

        int[] marks; // declaration of array: marks is getting defined in the stack
        // created at compile time

        marks= new int[5]; // initialisation of array: actually here object is being created in the memory (heap)
        // 1. created at runtime via dynamic memory allocation
        // 2. array object in heap may not be continues in java
        // 'new' keyword is used to create an object

        marks[0]=15;
        marks [1]=23;
        marks [2]=21;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);

        // String a = null;
        // null literal can only be assigned to a non-primitive datatypes

        Scanner in = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=in.nextInt();
        }

        // Example of an enhanced for loop
        for(int j : marks){
            System.out.print(j + " ");
        }

        // This method converts the elements of the array into a string
        System.out.println("\n"+Arrays.toString(marks));

        // array of objects
        String[] str = new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
