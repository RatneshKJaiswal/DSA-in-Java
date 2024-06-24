package Stacks_Queues;

public class DynamicQueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.display();
        queue.disArray();

        System.out.println(queue.remove());
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);
        System.out.println(queue.remove());
        queue.display();
        queue.disArray();
    }
}
