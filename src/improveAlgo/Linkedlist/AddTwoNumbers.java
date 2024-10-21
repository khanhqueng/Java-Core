package improveAlgo.Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();
        ListNode tail= result;
        int i=0;
        while(l1!=null || l2!=null || i!=0){
            int digit1= (l1!=null) ? l1.val : 0;
            int digit2= (l2!=null) ? l2.val : 0;
            int sum = digit1+digit2+i;
            i = sum/10;
            sum= sum%10;
            tail.next= new ListNode(sum);
            tail= tail.next;
            l1= (l1!=null) ? l1.next : l1;
            l2= (l2!=null) ? l2.next : l2;

        }

        return result.next;

    }
}
