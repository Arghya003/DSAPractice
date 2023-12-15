//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
class Delete_Node_From_DLL
{
	Node head;
	Node tail;
	
	void addToTheLast(Node node)
	{
		if(head ==  null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			tail.next.prev = tail;
			tail = tail.next;
		}
	}
	
	void printList(Node head)
	{	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp =  temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Delete_Node_From_DLL list = new Delete_Node_From_DLL();
			
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			list.addToTheLast(head);
			
			for(int i=1;i<n;i++)
			{
				int a = sc.nextInt();
				list.addToTheLast(new Node(a));
			}
			a1 = sc.nextInt();
			Solution g = new Solution();
			//System.out.println(list.temp.data);
			Node ptr = g.deleteNode(list.head, a1);
			list.printList(ptr);
			t--;
		}
	}
}


                               
// } Driver Code Ends


//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    
    
    
    
    Node deleteHead(Node head){
        if(head==null||head.next==null)
        return head;
        Node back=head;
        head=head.next;
        
        head.prev=null;
        back.next=null;
        return head;
        
        
        
    }
    Node deleteTail(Node head){
        
        if(head==null||head.next==null)
        return head;
        
        Node tail=head;
        
        while(tail.next!=null){
            tail=tail.next;
            
            
        }
        Node newTail=tail.prev;
        newTail.next=null;
        tail.prev=null;
        
        return head;
        
    }
    Node deleteNode(Node head,int x)
    {
	// Your code here	
    	if(head==null)
    	return null;
	    
	    int count=0;
	    Node dNode=head;
	    
	    while(dNode!=null){
	        count++;
	        if(count==x)
	        break;
	        dNode=dNode.next;
	    }
	    Node back=dNode.prev;
	    Node front=dNode.next;
	    
	    if(back==null&&front==null)
	    return null;
	    else if(back==null)
	    return deleteHead(head);
	    else if(front==null)
	    return deleteTail(head);
	    
	    back.next=front;
	    front.prev=back;
	    
	    dNode.next=null;
	    dNode.prev=null;
	    
	    return head;
	    
    }
}
