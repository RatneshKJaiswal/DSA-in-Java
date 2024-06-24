package Linked_List.Questions;

public class Rearrange {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // Rearrange

        ListNode temp =null;
        while(hf!=null&&hs!=null){
            temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // Setting next of tail to null
        if(hf != null){
            hf.next = null;
        }
    }

    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present !=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }

        return prev;
    }
}
