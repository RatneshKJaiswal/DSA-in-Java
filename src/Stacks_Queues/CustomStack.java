package Stacks_Queues;

import java.util.EmptyStackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int ptr = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    // This will create an object containing an array of some size in the heep
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return data[ptr--];
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
