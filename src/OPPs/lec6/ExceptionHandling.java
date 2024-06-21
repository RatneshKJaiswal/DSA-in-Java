package OPPs.lec6;

public class ExceptionHandling {
    // Exceptions occurs when there is an interruption in flow of program
    public static void main(String[] args) {
        int a =5;
        int b = 0;
        try {
//            System.out.println(a / b);
            div(12,0);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Closed");
        }
    }

    static int div(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");
        }

        return a / b;
    }
}
