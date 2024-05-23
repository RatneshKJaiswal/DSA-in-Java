package Sorting;

import java.util.*;
public class bubble {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of variables : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int a=0;a<n;a++){
            System.out.print("Enter the number : ");
            arr[a]=sc.nextInt();
        }

        // Time Complexity = O(n(n-1)/2)= O(n^2)
        // n^2 time complexity is not good for sorting

        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-1-i);j++){
                if(arr[j]>arr[j+1]){
                    arr[j+1]=arr[j+1]+arr[j];
                    arr[j]=arr[j+1]-arr[j];
                    arr[j+1]=arr[j+1]-arr[j];
                }
            }
        }

        for(int a=0;a<n;a++){
            System.out.print(arr[a]+" , ");
        }
    }
}
