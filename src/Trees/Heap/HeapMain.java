package Trees.Heap;

import java.util.ArrayList;

public class HeapMain {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(7);
        heap.insert(8);
        heap.insert(9);
        heap.insert(10);
        heap.insert(11);
        heap.insert(12);
        heap.insert(14);
        heap.insert(13);
        heap.insert(5);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList hp = heap.heapSort();
        System.out.println(hp);
    }
}
