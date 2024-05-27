package Searching;

import java.util.Scanner;

public class smallest_greatest_letter {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letter,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        else if(target<letters[0]){
            return letters[0];
        }
        for(int i=0;i<letters.length;i++){
            if(target<letters[i]){
                return letters[i];
            }
        }
        return '\0';
    }
}
