/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]= new int [1];
        height(root,diameter);
        return diameter[0];
        
    }
    int height(TreeNode root, int maxi[]){
        if(root==null)
        return 0;

       int lh=height(root.left ,maxi);
       int rh=height(root.right,maxi);
        maxi[0]=Math.max(lh+rh,maxi[0]);
        
        return 1+Math.max(lh,rh);
    }
}