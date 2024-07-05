package Sorting;

import java.util.Arrays;

public class Radix {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for(int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count , 0);


        for(int i=0; i<n; i++){
            count[(arr[i]/exp)%10]++;
        }

        System.out.println("Count array for " +exp+" : " + Arrays.toString(count));

        for(int j = 1; j <10; j++){
            count[j] = count[j] + count[j -1];
        }

        System.out.println("Updated Count array for " +exp+" : " + Arrays.toString(count));

        for(int i=n-1; i>=0; i--){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        System.out.println("Output Array "+Arrays.toString(output));

        System.arraycopy(output,0,arr,0,n);

    }
    public static void main(String[] args) {
        int[] arr = {29,83,471,36,91,8};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
