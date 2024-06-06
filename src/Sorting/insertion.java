package Sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        int i,j,p=0;
        for(i=1; i<arr.length; i++){
            for(j=i-1;j>=0;j--){
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                }
            }
            System.out.println("Pass "+(++p)+" -> "+Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a, int b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
}
