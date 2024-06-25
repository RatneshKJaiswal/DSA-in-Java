package Stacks_Queues;

import java.util.Stack;

public class Make_Paremthesis_Valid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='{' || ch =='[' || ch=='(') {
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                }
                if(ch == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                }
                if(ch == ']'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else{
                        stack.push(ch);
                    }
                }
            }
        }
        int x=0;

        while(!stack.isEmpty()){
            x++;
            stack.pop();
        }

        return x;
    }
}
