package Linked_List.Questions;

public class ReverseLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;

        }

        return node;

    }

    public ListNode reverseList_Recursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList_Recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right){
            return head;
        }
        int i;
        ListNode curr=head;
        ListNode prev = null;
        for(i=0; curr!=null && i<left-1; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        ListNode temp = curr.next;
        for(i=0 ; curr!=null && i<right-left+1 ; i++){
            curr.next = prev;
            ListNode node = curr;
            curr = temp;
            prev = node;
            if(curr!=null){
                temp = temp.next;
            }
        }

        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = curr;

        return head;
    }

}
