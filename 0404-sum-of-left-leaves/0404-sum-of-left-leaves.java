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
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,false);
        return ans;
    }
    int dfs(TreeNode root, boolean flag){
        if(root==null)
            return ans;
        
       
        
        if(root.right==null&& root.left==null&& flag==true)
            ans+=root.val;
         dfs(root.right,false);
        dfs(root.left,true);
        
        return ans;
    }
}