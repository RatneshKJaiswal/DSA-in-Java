package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n =10;
//        System.out.print("0 1");
//        seriesPrinter(0,1,n-2);
        System.out.println(fibo(n-1));
    }
//    public static void seriesPrinter(int a, int b, int n) {
//        if(n==0){
//            return;
//        }
//        else{
//            System.out.print(" "+(a+b));
//            seriesPrinter(b,a+b,n-1);
//        }
//    }
    public static int fibo(int n) {
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
