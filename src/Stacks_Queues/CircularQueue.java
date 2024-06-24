package Stacks_Queues;

public class CircularQueue {

    int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int end = 0, front =0 , size = 0;



    public CircularQueue() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    // This will create an object containing an array of some size in the heep
    public CircularQueue(int val) {
        this.data = new int[val];
    }

    public boolean insert(int item) {
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int item = data[front++];

        front %= data.length;
        size--;
        return item;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        if(front<end){
            for(int i=front;i<end;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println("END");
        }
        else{
            for(int i=front;i<data.length;i++){
                System.out.print(data[i]+" ");
            }
            for(int j = 0;j<end;j++){
                System.out.print(data[j]+" ");
            }
            System.out.println("END");
        }
    }

    public void disArray(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}
