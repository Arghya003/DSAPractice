/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return head;
        int l=1;
        ListNode temp=head;
        while(temp.next!=null){
            ++l;
            temp=temp.next;
        }
        k=k%l;
        int e=l-k;
        temp.next=head;

        while(e--!=0){
            temp=temp.next;
            
        }
        head=temp.next;
        temp.next=null;

        return head;
        
    }
}