package Recursion;

import java.util.ArrayList;

public class linearsearchOnMultipleOccurance {
    public static void main(String[] args) {
        int[] arr = {11,12,32,41,15,63,41,28,59,10};
        int target = 41;
        ArrayList<Integer> list = new ArrayList<>();
        list = check(arr,0,target, list);
        System.out.println(list);
    }
    public static ArrayList<Integer> check(int[] arr,int index, int target, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return check(arr,index+1,target,list);
    }
}
