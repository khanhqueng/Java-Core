package improveAlgo.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class MaximumDepth {
    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public static int maxDepth(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        int[] x= {0};
        bfs(queue,x[0]);
        return x[0];
    }
    public static void bfs(Queue<TreeNode> queue, int count){
        count++;
        Queue<TreeNode> Temp =new LinkedList<>();
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if(node == null) continue;
            if(node.left!=null) Temp.add(node.left);
            if(node.right!=null) Temp.add(node.right);
        }
        if(!Temp.isEmpty()){
            bfs(Temp, count);
        }
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(3, new TreeNode(9),new TreeNode(20,new TreeNode(15), new TreeNode(7)) );
        System.out.println(maxDepth(root));
    }
}
