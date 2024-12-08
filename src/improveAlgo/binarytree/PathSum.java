package improveAlgo.binarytree;

public class PathSum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        targetSum-=root.val;
        if(targetSum==0 && root.right==null && root.left==null) return true;
        boolean resultLeft=false,resultRight=false;
        if(root.left!=null)  resultLeft=hasPathSum(root.left,targetSum);
        if(root.right!=null)  resultRight=hasPathSum(root.right,targetSum);
        return resultLeft || resultRight;
    }
}
