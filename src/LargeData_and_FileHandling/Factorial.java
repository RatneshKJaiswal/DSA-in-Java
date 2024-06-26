package LargeData_and_FileHandling;

import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(int n) {

        BigInteger ans = BigInteger.valueOf(1);

        for(int i=2; i<=n; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
