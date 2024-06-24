package Stacks_Queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int capacity){
        super(capacity);
    }

    @Override
    public boolean insert(int value) {
        if(isFull()){
            // double the array size
            int[] temp = new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        // insert item
        // After upgrading it we can insert the value normally
        return super.insert(value);
    }
}
