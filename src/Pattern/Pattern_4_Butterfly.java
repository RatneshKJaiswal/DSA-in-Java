package Pattern;
public class Pattern_4_Butterfly {
    public static void main(String[] args) {
        int n=4;
        for(int i =1;i<=(2*n-1);i++){
            for(int j=1;j<=(2*n-1);j++){
                if(i<=n){
                    if(j<=i||j>((2*n-1)-i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                }
                else{
                    if(j>=i||j<=(2*n-i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                }
            }
            System.out.println("");
        }
    }
}
