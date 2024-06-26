package LargeData_and_FileHandling;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class StringBufferMain {
    public static void main(String[] args) {

        // Constructor 1
        // 16 bytes of space is created initially
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // append to modify object
        sb.append("We are Human");


        // Constructor 2
        StringBuffer sb2 = new StringBuffer("Hello");

        // Constructor 3
        StringBuffer sb3 = new StringBuffer(20);

        // functions
        sb.insert(2,"Raj");
        sb.replace(2,5, "Rahul");

        sb.delete(2,7);
        sb.reverse();
//        System.out.println(sb.capacity());

        String str = sb.toString();
        System.out.println(str);

        // Remove whitespace
        String sentence = "sdug f   sg df sg";
        System.out.println(sentence.replaceAll(" ",""));

        // split and save in the array
        String arr = "Ram Shayam Lakshaman Raju";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println(df.format(32.456));
    }
}
