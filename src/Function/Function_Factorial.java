import java.util.*;

public class Function_Factorial {
    public static int fact(int n){
        int mul=1;
        for(int i=1; i<=n; i++){
            mul=mul*i;
        }
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));        
    }

}
