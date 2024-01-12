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
  
    int ans=0;
    public int maxAncestorDiff(TreeNode root){
        if(root==null)
            return 0;
        dfs(root,root.val,root.val);
        return ans;
    }
    void dfs(TreeNode root,int min,int max){
        if(root==null)
            return;
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        ans=Math.max(ans,max-min);
        dfs(root.left,min,max);
        dfs(root.right,min,max);
    }
}