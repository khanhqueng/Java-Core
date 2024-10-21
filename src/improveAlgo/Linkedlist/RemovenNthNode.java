package improveAlgo.Linkedlist;

public class RemovenNthNode {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode tail = head;
        while(tail!=null){
            count++;
            tail= tail.next;
        }
        if(count==1) return null;
        tail= head;
        if(count== n) {
            head = head.next;
            return head;
        }
        while(tail!=null){
            if (count == n+1) {
                tail.next= tail.next.next;
                break;
            }
            tail= tail.next;
            count--;
        }
        return head;
    }
}
