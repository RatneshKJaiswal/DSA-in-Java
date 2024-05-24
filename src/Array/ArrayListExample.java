package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        // ArrayList -> pre-defined class
        // <...> -> Datatype specification via use of wrapper classes

        list.add(24);
        list.add(13);
        list.add(82);
        list.add(91);
        System.out.println(list);

        // function to add anything at a specific index
        list.add(2,30);
        System.out.println(list);

        // searching
        System.out.println(list.contains(91));

        // to modify any specific index
        list.set(1,88);
        System.out.println(list);

        // list.remove(2);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.set(i,sc.nextInt());
        }
        System.out.println(list);

        // to get the value at any particular index list[index] will not work
        // list.get(1);  -> this is used to get value at any particular index
    }
}
