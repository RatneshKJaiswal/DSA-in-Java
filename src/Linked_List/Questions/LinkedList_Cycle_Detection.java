package Linked_List.Questions;

/**
 * Fast and slow Pointer Method
 *
 */



public class LinkedList_Cycle_Detection {

    class ListNode {
        int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {

        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!=null){

            s=s.next;
            f=f.next.next;
            if(f==s){
                return true;
            }
        }

        return false;

    }
}
