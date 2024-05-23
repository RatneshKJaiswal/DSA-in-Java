package Pattern;
public class Pattern_Palindrome {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>1;k--){
                System.out.print(k+" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println("");
        }
    }
}
