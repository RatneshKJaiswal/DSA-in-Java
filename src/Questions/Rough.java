package Questions;

public class Rough {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != i+1) {
                int c = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[arr[i]-1] = c;
            } else {
                i++;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }
}
