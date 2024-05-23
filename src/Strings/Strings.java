package Strings;

public class Strings {
    public static void main(String[] args) {
        //Method 1 --> O(n)=n

        // StringBuffer sb = new StringBuffer("Hello");
        // StringBuffer nb = new StringBuffer("");

        // for (int i = (sb.length() - 1); i >= 0; i--) {
        //     nb.append(sb.charAt(i));
        // }

        // System.out.println(nb);

        //Method 2 --> O(n)=n/2

        StringBuffer sb = new StringBuffer("Hello");
        int l=sb.length();

        if(l%2==0){
            for(int i=0; i<l/2;i++){
                char front=sb.charAt(i);
                char back=sb.charAt(l-i-1);

                sb.setCharAt(i, back);
                sb.setCharAt(l-i-1, front);
            }
        }
        else{
            for(int i=0; i<(l+1)/2;i++){
                char front=sb.charAt(i);
                char back=sb.charAt(l-i-1);

                sb.setCharAt(i, back);
                sb.setCharAt(l-i-1, front);
            }
        }
        System.out.println(sb);
    }
}
