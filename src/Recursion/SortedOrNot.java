package Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {11,21,32,41,54,62,77,82,90};
        System.out.println(check(arr,0,8));
    }
    public static boolean check(int[] arr,int start,int end) {
        if(start == end) {
            return true;
        }
        if(arr[start] <= arr[start+1]) {
            return check(arr,start+1,end);
        }
        else{
            return false;
        }
    }
}
