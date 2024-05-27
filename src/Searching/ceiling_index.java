package Searching;

public class ceiling_index {
    public static void main(String[] args) {
        int[] arr = {1,12,23,44,51,68,71,78,92,102};
        int target = 33;
        System.out.println("Ceiling index is "+searchInsert(arr,target));

    }
    public static int searchInsert(int[] arr, int target) {
        int s=0,e=arr.length-1,mid;
        if(target>arr[e]){
            return e+1;
        }
        else if(target<arr[0]){
            return 0;
        }
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid]==target || (arr[mid]>target && arr[mid+1]<target)){
                return mid;
            }
            else if(arr[mid]<target && arr[mid+1]>target) {
                return mid + 1;
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
