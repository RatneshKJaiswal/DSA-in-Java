package Stacks_Queues;

import java.util.Stack;

public class HistogramQuestion {

    // Unoptimized approach
    public int largestRectangleArea1(int[] arr) {
        int[] sum = new int[arr.length];

        int max = 0;
        for(int i = 0; i< arr.length; i++){
            sum[i]=0;
            int j;
            for(j = i; j>=0 ;j--){
                if(arr[j]<arr[i]){
                    break;
                }
                sum[i] += arr[i];
            }
            for(j = i+1 ; j<arr.length ; j++){
                if(arr[j] < arr[i]){
                    break;
                }
                sum[i] += arr[i];
            }

            if(max<sum[i]){
                max = sum[i];
            }

            while(i+1<arr.length && arr[i]==arr[i+1]){
                i++;
            }

        }

        return max;
    }

    // Optimised approach
    public int largestRectangleArea2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for(int i = 1; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                max = getMax(arr, stack, max, i);
            }
            stack.push(i);
        }

        int i = arr.length;
        while(!stack.isEmpty()){
            max = getMax(arr, stack, max, i);
        }

        return max;
    }

    public int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        }
        else{
            area = arr[popped]* (i-1-stack.peek());
        }

        return Math.max(max, area);
    }
}
