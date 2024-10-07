package improveAlgo.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointers {
    public Node connect(Node root) {
        Queue<Node> node= new LinkedList<>();
        node.add(root);
        bfs(node);
        return root;
    }
    public void bfs(Queue<Node> queue){
        Queue<Node>  Temp =new LinkedList<>();
        while(!queue.isEmpty()){
            Node node= queue.poll();
            if(node == null) continue;
            if(node.left!=null) Temp.add(node.left);
            if(node.right!=null) Temp.add(node.right);
            node.next= queue.peek();
        }
        if(!Temp.isEmpty()){
            bfs(Temp);
        }
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
