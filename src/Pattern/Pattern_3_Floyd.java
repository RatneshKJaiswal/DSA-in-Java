package Pattern;
public class Pattern_3_Floyd {
    public static void main(String[] args) {
        int s=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println("");
        }
    }
}
