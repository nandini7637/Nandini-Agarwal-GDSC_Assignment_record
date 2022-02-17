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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null)
            return null;
        
        ListNode temp1 = head;
        
        int count = length(head);
        
        if(count==n)
            return head.next;
        
        int i=1;
        int pos =count-n;
        while(i<pos)
        {
            temp1=temp1.next;
            i++;
        }
     temp1.next = temp1.next.next;
        
        return head;
    }
        
    
    
    
     public int length(ListNode head)
     {
         int count=0;
          ListNode temp = head;
         while(temp!=null)
         {
             count++;
             temp=temp.next;
         }
         return count;
     }
    
}
