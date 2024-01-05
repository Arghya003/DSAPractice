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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();

        if(root==null) return res;
        Stack<List<Integer>> stk = new Stack<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> lst= new ArrayList<>();
            int size= q.size();
            while(size-->0)
            {
               
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                lst.add(q.poll().val);
            }
            stk.push(lst);
        }
        while(!stk.isEmpty())
            res.add(stk.pop());
        return res;
    }
    }
