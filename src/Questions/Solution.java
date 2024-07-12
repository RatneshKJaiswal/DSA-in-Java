package Questions;

import java.util.Stack;

class Solution {
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        int idx=1;
        StringBuilder temp= new StringBuilder();
        while(idx<s.length()){
            temp = new StringBuilder();
            if(s.charAt(idx)==')'){
                while(stack.pop()!='('){
                    temp.append(stack.pop());
                }
                for(int i=0;i<temp.length();i++){
                    stack.push(temp.charAt(i));
                }
            } else{
                stack.push(s.charAt(idx));
            }
            idx++;
        }

        return temp.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("(abcd)"));
    }
}