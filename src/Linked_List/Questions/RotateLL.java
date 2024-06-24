package Linked_List.Questions;

public class RotateLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }

        ListNode tail = head;
        // ListNode tailPrev = null;
        int count = 1;
        while(tail.next!=null){
            // tailPrev = tail;
            tail = tail.next;
            count++;
        }

        if(k%count==0){
            return head;
        }

        if(count>k){
            count=count-k;
        }
        else if(count<k){
            count=count-k%count;
        }

        ListNode node =null;
        ListNode next = head;
        while(count>0){
            node = next;
            next = next.next;
            count--;
        }

        tail.next = head;
        node.next = null;
        head = next;

        return head;
    }

}
