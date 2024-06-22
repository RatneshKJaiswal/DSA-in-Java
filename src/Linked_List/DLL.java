package Linked_List;

import org.w3c.dom.Node;

public class DLL {
    private Node head;
    private Node tail;

    private int size;

    public DLL() {
        this.size = 0;
    }

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        if(size==0) {
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        head = newNode;
        size++;
    }


    public void display(){
        Node current = head;
        while(current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
}
