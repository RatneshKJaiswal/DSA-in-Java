package Linked_List.Questions;

public class Cycle_Index {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                // k = lengthCycle(slow,head);
                break;
            }
        }

        if(fast==null || fast.next==null) return null;

        while(head!=slow){
            head = head.next;
            slow = slow.next;
        }

        return head;


    }
}
