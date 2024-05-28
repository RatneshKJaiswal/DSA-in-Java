package Searching;

public class Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        int target = 6;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        int peek = binary_peek(arr);
        if(target>=arr[0]){
            return binary_search(arr, 0, peek, target);
        }
        else{
            return binary_search(arr, peek+1, arr.length-1, target);
        }
    }
    public static int binary_peek(int[] arr){
        int s=0,e=arr.length-1,mid;
        if(e==0){
            return e;
        }
        else if(e==1){
            if(arr[0]>arr[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        else if(arr[0]>arr[1]){
            return 0;
        }
        else if(arr[e]>arr[e-1] && arr[e]>arr[0]){
            return e;
        }
        while(s <= e){
            mid = s+(e-s)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            if(arr[mid]<arr[arr.length-1]) {
                if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
            else{
                if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }

        }
        return -1;
    }
    public static int binary_search(int[] arr, int s, int e, int target){
        int mid;
        while(s<=e){
            mid= s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}
