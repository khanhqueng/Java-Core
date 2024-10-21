package improveAlgo.Linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        int duplicate= 0;
        ListNode tail = head;
        Map<Integer, Integer> map = new HashMap<>();
        if(head==null) return null;
        while(tail!=null ){
            map.put(tail.val,map.getOrDefault(tail.val,0)+1);
            tail= tail.next;
        }
        tail= head;
        ListNode tail2= head.next;
        boolean isHeadDuplicate=true;
        while(tail2!=null && tail.next!=null){
            if(map.get(tail2.val)==1) {
                tail.next = tail2;
                tail= tail.next;
            }
            tail2=tail2.next;

            if(map.get(head.val)==1 && isHeadDuplicate){{
                isHeadDuplicate=false;

            }}
            else head= head.next;
        }
        return map.get(head.val)>1 ? head : head.next;
    }

}
