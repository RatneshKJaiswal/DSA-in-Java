package Function;

public class squareRoot {
    public static void main(String[] args) {
        System.out.printf("%.2f",(float)sqrt(43));
    }
    public static double sqrt(double n) {
        double x=n;
        double root;
        while(true){
            root = 0.5*(x + (n/x));
            if(Math.abs(root-x)<0.01){
                break;
            }
            x=root;
        }
        return root;
    }
}
