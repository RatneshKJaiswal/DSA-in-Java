package LargeData_and_FileHandling;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {

        Random rand = new Random();
        StringBuffer sb = new StringBuffer(10);

        for (int i = 0; i < 10; i++) {
            char ch = (char)rand.nextInt(97,123);
            sb.append(ch);
        }

        String str = sb.toString();
        System.out.println(str);
    }
}
