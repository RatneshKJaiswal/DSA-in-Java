package Linked_List;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.next = next;
            this.value = value;
        }
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(size == 0){
            tail = newNode;
        }
        size++;
    }

    public void insertLast(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        if(size == 0){
            head = newNode;
        }
        size++;
    }

    public void insertIndex(int index, int value){
        Node current = head;
        if(size == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        for(int i = 0; i < index-1; i++){
            current = current.next;
        }
        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public int deleteFirst(){
        if(size == 0){
            System.out.println("Nothing to delete");
            return -1;
        }
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size == 0){
            System.out.println("Nothing to delete");
            return -1;
        }
        if(size == 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        secondLast.next = secondLast.next.next;
        tail = secondLast;

        return value;
    }

    public int deleteIndex(int index){
        if(size == 0){
            System.out.println("Nothing to delete");
            return -1;
        }
        if(index == 0){
            size--;
            return deleteFirst();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return value;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }

}
