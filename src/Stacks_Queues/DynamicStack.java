package Stacks_Queues;

import java.util.Stack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();    // it will call CustomStack();
    }

    public DynamicStack(int size) {
        super(size);    // it will call CustomStack(int size);
    }

    @Override
    public boolean push(int value) {
        if(isFull()){
            // double the array size
            int[] temp = new int[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        // insert item
        // After upgrading it we can insert the value normally
        return super.push(value);
    }

}
