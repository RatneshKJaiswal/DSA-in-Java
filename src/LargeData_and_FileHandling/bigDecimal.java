package LargeData_and_FileHandling;

import java.math.BigDecimal;

public class bigDecimal {
    public static void main(String[] args) {
        double a = 0.04;
        double b = 0.03;
        System.out.println(a-b);

        BigDecimal A = BigDecimal.valueOf(453450.04324134223);
        BigDecimal B = BigDecimal.valueOf(2342340.032342452355);
        System.out.println(A.subtract(B));

        // operations

        System.out.println(A.multiply(B));

        System.out.println(A.subtract(B));

        System.out.println(B.divide(B));

        System.out.println(A.remainder(B));

        System.out.println(A.pow(21));

        // Constants
        BigDecimal C = BigDecimal.TEN;
        System.out.println(C);
    }
}
