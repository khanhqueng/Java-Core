package Tyme;


import java.util.List;

public class MiddleNode {
    public static void main(String[] args) {
        MiddleNode middleNode= new MiddleNode();
        ListNode head= new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4,new ListNode(5, new ListNode(6))))));

        System.out.println(middleNode.middleNode(head).val);
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head){
        int size = 0;
        ListNode tail = head;
        while (tail != null) {
            size++;
            tail = tail.next;
        }
        tail = head;
        int indexMiddle = size / 2 + 1;
        for (int i = 1; i < indexMiddle; i++) {
            tail = tail.next;
        }
        return tail;

    }

}
