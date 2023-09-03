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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans= new ArrayList<>();
        if(root==null)
        return ans;
        Queue<TreeNode>q=new LinkedList<TreeNode>();

        q.offer(root);
        boolean f=true;

        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>temp= new ArrayList<>();

            for(int i=0;i<size;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                if(f==true)
                temp.add(q.poll().val);
                else
                temp.add(0,q.poll().val);
            }
            f=!f;
            ans.add(temp);
        }
        return ans;
        
    }
}