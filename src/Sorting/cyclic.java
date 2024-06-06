package Sorting;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,4,9,7,6,8};
        csort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void csort(int[] arr){
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=i+1){
                swap(arr,i,arr[i]-1);
            }
        }
    }
    public static void swap(int[] arr , int a, int b){
        int c = arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
}
