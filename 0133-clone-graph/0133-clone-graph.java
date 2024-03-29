/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        Node copy=new Node(node.val);
        Node vis[]=new Node[1000];
        Arrays.fill(vis,null);
        dfs(node,copy,vis);
        return copy;
    }
    void dfs(Node node, Node copy, Node vis[]){
        vis[copy.val]=copy;
        
        for(Node n: node.neighbors){
            if(vis[n.val]==null){
                Node newNode=new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n,newNode,vis);
            }
            else{
                copy.neighbors.add(vis[n.val]);
            }
        }
    }
}

 