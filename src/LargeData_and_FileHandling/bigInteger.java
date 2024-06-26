package LargeData_and_FileHandling;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        int a= 20;
        int b = 43;

        BigInteger A = BigInteger.valueOf(21435);  // converting int to big integer
        int x =A.intValue();  // converting bigInteger to int
        BigInteger B = BigInteger.valueOf(3442);
        BigInteger C = new BigInteger("64637273562235635343");

        // constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger E = A.add(B);
        System.out.println(E);
        System.out.println(A.add(C));

        // multiply
        System.out.println(A.multiply(C));

        System.out.println(A.subtract(B));

        System.out.println(A.divide(C));

        System.out.println(A.remainder(C));

        if(A.compareTo(C)<0){
            System.out.println("yes");
        }

        System.out.println(A.pow(21));

        System.out.println(Factorial.fact(98));
    }
}
