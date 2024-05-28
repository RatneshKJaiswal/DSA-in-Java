package Searching;

// To be done in O(log N)

public class peek_mountain {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5,6};
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
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}

//          int s=0,e=arr.length-1,mid;
//          while(s < e){
//          mid = s+(e-s)/2;
//          if(arr[mid] > arr[mid+1]){
//              e = mid;
//          }
//          else{
//              s=mid+1;
//          }
//          }
//          return s;
