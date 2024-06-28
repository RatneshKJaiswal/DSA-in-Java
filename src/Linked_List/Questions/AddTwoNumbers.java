package Linked_List.Questions;

import java.util.Arrays;

public class AddTwoNumbers {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = value(l1);
        int val2 = value(l2);
        int sum = res(val1) + res(val2);

        ListNode head = new ListNode();
        ListNode temp;
        head.val = sum%10;
        sum = sum/10;
        temp = head;
        while(sum>0){

                ListNode node = new ListNode();
                node.val = sum%10;
                sum = sum/10;
                head.next = node;
                node = head;

        }

        return temp;
    }

    public int value(ListNode node){
        int sum = 0;
        while(node!=null){
            sum+=node.val;
            node= node.next;
        }
        return sum;
    }

    public int res(int sum){
        int res = 0;
        while(sum>0){
            res = res*10 + sum%10;
            sum= sum/10;
        }
        return res;
    }
}
