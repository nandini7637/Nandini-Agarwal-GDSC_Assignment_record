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
    public ListNode middleNode(ListNode head) {
         int count=middle(head);

        ListNode temp = head;
       for(int i=0;i<count;i++)
       {
           temp=temp.next;
       }
        return temp;
    }
    
    public int middle(ListNode head)
    {
        int count=0;
         while(head!=null)
        {
            count++;
            head=head.next;
        }
        
        return count/2;
    }
        
        
    
    
}
