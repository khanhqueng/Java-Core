package improveAlgo.Linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseLinkedList2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count=0;
        ListNode tail= head;
        ListNode before= null;
        ListNode after= null;
        List<ListNode> list= new ArrayList<>();
        while(tail!=null){
            count++;
            if(count>=left && count<=right){
                list.add(tail);
            }
            if(count==left-1) before= tail;
            if(count==right+1) after= tail;
            tail= tail.next;
        }
        for(int i=list.size()-1;i>=1;i--){
            list.get(i).next=list.get(i-1);
        }
        if(before!=null) before.next= list.getLast();
        list.getFirst().next= after;
        if(left==1){
            head= list.getLast();
        }
        return head;

    }
}
