package Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 12);
        map.put("Roy", 21);
        map.put("Coll", 3);

        System.out.println(map.get("Roy"));
        System.out.println(map.getOrDefault("Ram",98));
        System.out.println(map.containsKey("Ram"));

        HashSet<Integer> set = new HashSet<>();
        set.add(11);
        set.add(2);
        set.add(13);
        set.add(2);
        set.add(151);

        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        System.out.println(treeSet);    // Will return data in tree sorted form

    }
}
