package OPPs.lec6;

import jdk.dynalink.Operation;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        arr.forEach(item -> System.out.println(item*2));

        Operations sum = (a,b) -> a + b;
        Operations dif = (a,b) -> a-b;
        Operations pro = (a,b) -> a*b;
        Operations div = (a,b) -> a/b;

        LambdaFunction cal = new LambdaFunction();
        System.out.println(cal.operate(5,4,sum));
        System.out.println(cal.operate(5,4,dif));
        System.out.println(cal.operate(5,4,pro));
        System.out.println(cal.operate(5,4,div));

    }

    private int operate (int a, int b, Operations op){
        return op.operation(a,b);
    }

//    int sum(int a, int b) {
//        return a + b;
//    }
}

interface Operations {
    int operation(int a, int b);
}
