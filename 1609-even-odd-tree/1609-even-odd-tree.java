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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode current=root;
        boolean even =true;
        q.add(current);
        
        while(!q.isEmpty()){
            int size=q.size();
            int prev=Integer.MAX_VALUE;
            if(even==true){
                prev=Integer.MIN_VALUE;
            }
            while(size>0){
                TreeNode node=q.poll();
                
                
                if ((even && (node.val % 2 == 0 || node.val <= prev)) ||
                        (!even && (node.val % 2 == 1 || node.val >= prev)))
                    return false;
                
                prev=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                
                size--;
                
            }
            even=!even;
        }
        return true;
    }
}