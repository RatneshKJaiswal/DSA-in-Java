package Searching;

// To be done in O(log N)

public class peek_mountain {
    public static void main(String[] args) {
        int[] arr = {0,11,7,6,5,3,1};
        int val = peakIndexInMountainArray(arr);
        System.out.println(val);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0,e=arr.length-1,mid;
        while(s <= e){
            mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
