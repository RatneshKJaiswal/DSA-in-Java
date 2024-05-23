import java.util.*;

public class Function_Sum {
    public static int sumFunction(int i,int j){
        int sum=i+j;
        return sum;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i =sc.nextInt();
       int j =sc.nextInt();
       
       int sum=sumFunction(i, j);
       System.out.println(sum);
    }
}
