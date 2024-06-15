package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber_combinations {
    public static void main(String[] args) {
        List<String> list = letterCombinations("24");
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        return pad("",digits);
    }
    public static List<String> pad(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit-1)*3; i < 3*digit; i++){
            char ch = (char) ('a' + i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }
        return ans;
    }
}
