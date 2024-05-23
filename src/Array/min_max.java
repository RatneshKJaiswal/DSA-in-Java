package Array;
import java.util.*;
public class min_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int ary[]= new int[l];
        for(int i=0;i<l;i++){
            System.out.print("Enter : ");
            ary[i]=sc.nextInt();
        }
        int min=ary[0];
        int max=ary[0];
        for(int i=0;i<l;i++){
            if(ary[i]<min){
                min=ary[i+1];
            }
            else if(ary[i]>max){
                max=ary[i];
            }
        }

        System.err.println(min);
        System.out.println(max);
    }
}
