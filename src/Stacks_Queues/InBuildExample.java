package Stacks_Queues;

import java.util.*;

public class InBuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

        // ArrayDeque is fast then normal linked list based deque, as it supports insertion and deletion from both the sides
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(45);
        deque.add(50);
        deque.add(60);
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());

        System.out.println(deque);

    }
}
