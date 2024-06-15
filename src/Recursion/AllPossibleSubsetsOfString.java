package Recursion;

import java.util.ArrayList;

public class AllPossibleSubsetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        subsec("",str);

        ArrayList<String> list = new ArrayList<>(subsecA("", str));
        System.out.println(list);
    }
    // based on taking and ignoring value at places on by one
    // Direct printing method
    public static void subsec(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch =up.charAt(0);
        subsec(p+ch,up.substring(1));
        subsec(p,up.substring(1));
    }

    // Adding elements in the form of Arraylist
    public static ArrayList<String> subsecA(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch =up.charAt(0);
        ArrayList<String> left = subsecA(p+ch,up.substring(1));
        ArrayList<String> right = subsecA(p,up.substring(1));

        left.addAll(right);
        return left;
    }

}
