package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,12,34,76,93,97,104};
        int target = 7;
        int index = search(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
    public static int search(int[] arr, int target, int start, int end) {
        if (start == end) {
            return end;
        }
        else if(start > end){
            return -1;
        }
        else{
            int mid = (start + end)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                return search(arr, target, start, mid-1);
            }
            else{
                return search(arr, target, mid+1, end);
            }
        }
    }
}
