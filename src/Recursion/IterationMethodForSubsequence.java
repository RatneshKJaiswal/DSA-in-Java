package Recursion;

import java.util.ArrayList;

public class IterationMethodForSubsequence {
        public static void main(String[] args) {
            String str = "abc";
            ArrayList<String> list = new ArrayList<>();

            // Start from an empty output string
            list.add("");

            for (int i = 0; i < str.length(); i++) {
                // Consider all subsequences for elements in str[i]
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    // Create a new subsequence by appending str[i] to existing subsequences
                    list.add(list.get(j) + str.charAt(i));
                }
            }

            // Print all subsequences
            System.out.println(list);
        }
}
