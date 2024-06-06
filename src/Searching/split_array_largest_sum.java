package Searching;

public class split_array_largest_sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int m = 2;
        int result = splitArray(arr,m);
        System.out.println(result);
    }
    public static int splitArray(int[] arr, int m) {
        int start=0,end=0,mid=0;
        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);     // maximum value when m=arr.length
            end+=arr[i];                        // maximum value when m=1
        }

        // Binary Search   as required value will be in between the range of start and end only

        while(start<end){
            // assume mid as potential answer
            mid = start +(end-start)/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:arr){
                if(sum + num > mid){
                    // create a new subarray
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start = mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;

    }
}
