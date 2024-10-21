package improveAlgo.Linkedlist;

import java.util.*;

public class CopyListRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        Node tail = head;
        Map<Node,Node> map = new LinkedHashMap<>();
        while(tail!=null){
            map.put(tail, new Node(tail.val));
            tail= tail.next;
        }
        tail=head;
        while(tail!=null){
            map.get(tail).next= map.get(tail.next);
            map.get(tail).random= map.get(tail.random);
            tail= tail.next;
        }

        return map.get(head);
    }
    public static void main(String[] args){
        Node node1= new Node(3);
        Node node2= new Node(3);
        Node node3= new Node(3);
        node1.next= node2;
        node2.next=node3;
        node2.random= node1;
        copyRandomList(node1);
    }
}
