package Recursion;

import java.util.ArrayList;
import java.util.List;

public class All_Possible_Subsets_Of_Number_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();
        list = allPossibleSubsets(arr);
        System.out.println(list);
    }
    public static List<List<Integer>> allPossibleSubsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
