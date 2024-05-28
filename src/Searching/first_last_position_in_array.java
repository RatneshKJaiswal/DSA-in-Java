package Searching;

import java.util.Arrays;

public class first_last_position_in_array {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,9};
        int target = 9;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] arr, int target) {
        int s=0,e=arr.length-1,mid,x=-1,y=-1;
        int[] ary = {-1,-1};
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid]==target){
                x=mid;
                e=mid-1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
        }

        s=0;
        e=arr.length-1;
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid]==target){
                y=mid;
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
        }
        ary[0]=x;
        ary[1]=y;
        return ary;
    }
}
