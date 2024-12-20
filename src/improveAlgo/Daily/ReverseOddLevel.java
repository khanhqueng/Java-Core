package improveAlgo.Daily;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseOddLevel {
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
    public static void main(String[] args) {
        TreeNode root= new TreeNode(7,new TreeNode(13), new TreeNode(11));
        System.out.println(reverseOddLevels(root));
    }
    public static TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> node= new LinkedList<>();
        node.add(root);
        bfs(node, new Stack<>(), 0);
        return root;
    }
    static void bfs(Queue<TreeNode> queue, Stack<Integer> reverse, int level){
        Queue<TreeNode> Temp =new LinkedList<>();
        Stack<Integer> Reverse= new Stack<>();
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if(node == null) continue;
            if(level%2==0){
                if(node.left!=null) Reverse.add(node.left.val);
                if(node.right!=null) Reverse.add(node.right.val);
            }
            if(level%2!=0){
                node.val= reverse.pop();
            }
            if(node.left!=null) Temp.add(node.left);
            if(node.right!=null) Temp.add(node.right);
        }
        if(!Temp.isEmpty()){
            bfs(Temp, Reverse, level+1);
        }
    }
}
