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
    int maxD;
    int ans;
    public int findBottomLeftValue(TreeNode root) {
        maxD=-1;
        ans=0;
        dfs(root,0);
        return ans;
        
    }
    void dfs(TreeNode root,int depth){
        if(root==null)
            return;
        
        if(depth>maxD){
            maxD=depth;
            ans=root.val;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
        
    }
}