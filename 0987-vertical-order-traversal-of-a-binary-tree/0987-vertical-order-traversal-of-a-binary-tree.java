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
 class Pair{
    TreeNode node;
     int row;
     int col;
     public Pair(TreeNode n, int r ,int c){
         node=n;
         row=r;
         col=c;
     }
    }
class Solution {
   
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Pair>q=new LinkedList<Pair>();
        q.offer(new Pair(root,0,0));
        
        while(!q.isEmpty())  {
            Pair p= q.poll();
            TreeNode node= p.node;
            int x=p.row;   //verticals
            int y= p.col;   // levels
          
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap < > ());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue < > ());
            }
            map.get(x).get(y).offer(node.val);

             if (node.left != null) {
                q.offer(new Pair(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Pair(node.right, x + 1, y + 1));
            }
            
        }
        List < List < Integer >> list = new ArrayList < > ();
        for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            list.add(new ArrayList < > ());
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
      
    
    }
}