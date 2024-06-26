package Stacks_Queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    private int end = 0;

    public CustomQueue() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    // This will create an object containing an array of some size in the heep
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int item = data[0];

        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return item;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public void display(){
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + "  ");
        }
        System.out.println("END");
    }
}
