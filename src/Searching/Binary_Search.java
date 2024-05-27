package Searching;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Number : ");
        target=sc.nextInt();
        int val = search(arr,target);
        System.out.println("Target is at index : "+val);
    }
    public static int search(int[] arr, int target){
        int s=0,e=arr.length-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
