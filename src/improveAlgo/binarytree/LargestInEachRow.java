package improveAlgo.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestInEachRow {
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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> node= new LinkedList<>();
        node.add(root);
        List<Integer> result= new ArrayList<>();
        bfs(node, result);
        return result;
    }
    private void bfs(Queue<TreeNode> queue, List<Integer> result){
        Queue<TreeNode> Temp =new LinkedList<>();
        int max= Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            TreeNode node= queue.poll();
            if(node == null) continue;
            max=Math.max(max, node.val);
            if(node.left!=null) Temp.add(node.left);
            if(node.right!=null) Temp.add(node.right);
        }
        result.add(max);
        if(!Temp.isEmpty()){
            bfs(Temp, result);
        }
    }
}
