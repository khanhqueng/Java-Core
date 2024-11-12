package improveAlgo.binarytree;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinary {
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
    public void flatten(TreeNode root) {
        if (root==null) return;
        TreeNode tail= root;
        while(tail!=null){
            if(tail.left!=null){
                TreeNode left= tail.left;
                while(left.right!=null){
                    left= left.right;
                }
                left.right= tail.right;
                tail.right=tail.left;
                tail.left=null;
            }
            tail=tail.right;
        }
    }
}
