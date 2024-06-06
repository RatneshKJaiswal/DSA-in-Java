package Searching;

public class Sorted_rowncolumn_2D {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int n = 33;

        System.out.println(search(arr,n));
    }
    public static boolean search(int[][] arr, int search){
        int i=0;
        while(i < arr.length){
            if(search==arr[i][i]){
                return true;
            }
            else if(search>arr[i][i]){
                i++;
            }
            else{
                i--;
                break;
            }
        }
        int j=i+1;
        while(j < arr.length){
            if(arr[i][j]==search){
                return true;
            }
            else{
                j++;
            }
        }
        j=i;
        while(i < arr.length){
            if(arr[j][i]==search){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
