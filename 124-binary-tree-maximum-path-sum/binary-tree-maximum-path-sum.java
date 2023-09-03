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
    public int maxPathSum(TreeNode root) {
        int max[]= new int[1];
        max[0]=Integer.MIN_VALUE;
        path(root,max);
        return max[0];
    }
    int path(TreeNode root,int max[]){
        if(root==null)
        return 0;

        int lp=Math.max(0,path(root.left,max));
        int rp=Math.max(0,path(root.right,max));

        max[0]= Math.max(max[0],root.val+lp+rp);
        return root.val+Math.max(lp,rp);
    }
}