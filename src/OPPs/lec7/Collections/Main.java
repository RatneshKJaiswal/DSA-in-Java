package OPPs.lec7.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        System.out.println(list1.isEmpty());

        list2.add(1);
        list2.add(21);
        list2.add(13);
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();
        list3.add(1);
        list3.add(21);
        list3.add(13);
        System.out.println(list3);
    }
}
