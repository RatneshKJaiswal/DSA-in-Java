package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,1,4,9,8};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int s=low;
        int e=high;
        int mid=s+(e-s)/2;

        while(s<=e){
            // these steps are the reasons that if in quick sort array is sorted, swapping do not occur
            while(arr[s]<arr[mid]){
                s++;
            }
            while(arr[e]>arr[mid]){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index now sort both the left and right parts
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
