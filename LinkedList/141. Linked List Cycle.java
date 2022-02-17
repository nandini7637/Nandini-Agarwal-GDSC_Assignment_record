/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
        
        ListNode prev = head;
        ListNode forw = head.next;
        
        while(prev!=forw)
        {
            if(forw==null || forw.next==null)
                return false;
            
            prev= prev.next;
            forw = forw.next.next;
        }
            
        return true;
    }
}
