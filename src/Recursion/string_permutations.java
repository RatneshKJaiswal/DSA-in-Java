package Recursion;

import java.util.ArrayList;

public class string_permutations {
    public static void main(String[] args) {
//        permutations("","abc");
        ArrayList<String> ans = permutationsA("","abc");
        System.out.println(ans);
    }

    public static void permutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutations(f + ch + s, up.substring(1));
        }
    }

    public static ArrayList<String> permutationsA(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationsA(f + ch + s, up.substring(1)));
        }

        return ans;
    }
}
