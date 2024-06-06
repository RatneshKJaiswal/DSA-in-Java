package Sorting;

public class missing_number {
    public static void main(String[] args) {
        int[] arr = {3,0,6,1,2,5};
        int m = missingNumber(arr);
        System.out.println(m);
    }
    public static int missingNumber(int[] arr) {
        int i;
        for(i=0;i<arr.length;i++){
            while(arr[i]!=i){
                if(arr[i]==arr.length){
                    break;
                }
                change(arr,i,arr[i]);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }
    public static void change(int[] arr , int a, int b){
        int c = arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
}

//Find sum of range [0,n]
//and subtract it with sum of elements of the array, we will get the result missing element
