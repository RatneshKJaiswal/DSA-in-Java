package Questions;

public class even_digitNum_in_array {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean b = digit(arr[i]);
            if(b) count++;
        }
        return count;
    }


//    public static boolean digit(int num) {
//        int count=0;
//        while(num>=1){
//            count++;
//            num/=10;
//        }
//        return count % 2 == 0;
//    }

    // Optimised method to calculate number of digits
    public static boolean digit(int num) {
        int count=(int)Math.log10(num)+1;
        return count%2==0;
    }
}
