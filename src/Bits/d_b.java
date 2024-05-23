package Bits;

import java.util.*;
public class d_b{
    public static void decimaltobinary(int a){
        String str="";
        for(int i=0;i<=10;i++){
            int bm=1<<i;
            if((bm & a)==0){
                str= str+"0";
            }
            else if((bm & a)!=0){
                str= str+"1";
            }
            else{
                break;
            }
        }
        String st="";
        int l= str.length();
        for(int i=1;i<=l;i++)
        {
            st = st + str.charAt(l-i);
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal : ");
        int a=sc.nextInt();
        decimaltobinary(a);
    }
}