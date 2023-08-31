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
    public List<Integer>ans= new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        

        Recur(root);
        return ans;
        
    }
    public void Recur(TreeNode root)
    {
         
          if(root==null)
            return;


          ans.add(root.val);

            Recur(root.left);
            Recur(root.right);

        
    }
}