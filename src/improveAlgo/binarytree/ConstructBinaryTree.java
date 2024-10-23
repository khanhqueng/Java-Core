package improveAlgo.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructBinaryTree {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i: preorder){
            queue.add(i);
        }
        return construct(queue,inorder);


    }
    public TreeNode construct(Queue<Integer> queue, int[] inorder){
        if(inorder.length>0){
            int index= indexOf(inorder, queue.poll());
            TreeNode node= new TreeNode(inorder[index]);
            node.left= construct(queue, Arrays.copyOfRange(inorder,0,index));
            node.right= construct(queue, Arrays.copyOfRange(inorder,index+1,inorder.length));
            return node;
        }
        return null;
    }
    private int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
