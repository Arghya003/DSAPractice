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
    public int rangeSumBST(TreeNode root, int low, int high) {
        util(root, low, high);
        return ans;
    }

    void util(TreeNode root, int low, int high){
        if(root == null){
            return;
        }
        if(low <= root.val &&  root.val <= high){
            ans += root.val;
        }
        util(root.left, low, high);
        util(root.right, low, high);
    }
}
