package Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countSort {

    public static void countSorting(int[] arr){
        if(arr == null || arr.length <= 1) return;

        int max = arr[0];
        for(int i: arr){
            if(i > max) max = i;
        }

        int[] count = new int[max+1];
        for(int num: arr){
            count[num]++;
        }

        int index = 0;
        for(int i=0; i<=max; i++){
            while(count[i]-- > 0){
                arr[index++] = i;
            }
        }
    }

    public static void countSortingHash(int[] arr){
        if(arr == null || arr.length <= 1) return;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int index = 0;
        for(int i=min; i<=max; i++){
            int count = map.getOrDefault(i, 0);
            while(count-- > 0){
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,3,1,5,2,8};
//        countSorting(arr);
        countSortingHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
