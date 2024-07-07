package SQRT_Decomposition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,3,1,3,4,8};
        int n = arr.length;

        // Build a block array
        int sqrt = (int) Math.sqrt(n);

        int blocks_id=-1;
        int[] block = new int[sqrt+1];

        for(int i=0; i<n; i++){
            if(i%sqrt==0){
                blocks_id++;
            }
            block[blocks_id]+=arr[i];
        }

        System.out.println(Arrays.toString(block));

        System.out.println(query(block, arr, 2,8, sqrt));

    }

    public static int query(int[] block, int[] arr, int l, int r, int sqrt) {
        int ans=0;

        // start part
        while(l%sqrt!=0 && l<r && l!=0) {
            ans += arr[l];
            l++;
        }

        //Middle Part
        while((l+sqrt) <=r){
            ans += block[l/sqrt];
            l+=sqrt;
        }

        // Right Part
        while(l<=r) {
            ans += arr[l];
            l++;
        }

        return ans;
    }
}
