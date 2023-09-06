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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ans= new ArrayList<Integer>();
        pre(root,ans,0);
        return ans;
        
    }
    public void pre(TreeNode root,List<Integer>ans,int level){

        if(root==null)
        return;

        if(level==ans.size())
        ans.add(root.val);

        pre(root.right,ans,level+1);
        pre(root.left,ans,level+1);
    }
}