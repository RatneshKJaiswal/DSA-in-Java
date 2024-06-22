package Linked_List;

public class CLL {

    private int size;
    private Node head;
    private Node tail;

    public CLL() {
        this.size = 0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
        size++;
    }

    public int delete(int index){
        if(size == 0){
            System.out.println("The list is empty");
            return -1;
        }
        Node temp = get(index-1);
        int value = temp.next.value;
        if(temp.next == head){
            return value;
        }
        else if(temp.next == tail){
            return value;
        }
        else{
            temp.next = temp.next.next;
            return value;
        }
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node current = head;
        if(current == null){
            System.out.println("The list is empty");
            return;
        }
        while(current != tail){
            System.out.print(current.value + " -> ");
            current = current.next;
        };
        System.out.println(tail.value);

    }

}
