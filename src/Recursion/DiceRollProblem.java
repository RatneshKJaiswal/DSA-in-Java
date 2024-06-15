package Recursion;

import java.util.ArrayList;

public class DiceRollProblem {
    public static void main(String[] args) {
        ArrayList<String> list =dice("",4);
        System.out.println(list);
    }
    public static ArrayList<String> dice(String p, int target) {
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i=1;i<6 && i<=target;i++){
            res.addAll(dice(p+i,target-i));
        }
        return res;
    }
}
