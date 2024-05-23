import java.util.*;

public class Function_Multiply {
    public static int multiplyFunction(int i, int j){
        return i*j;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        
        System.out.println(multiplyFunction(i, j));
    }
}
