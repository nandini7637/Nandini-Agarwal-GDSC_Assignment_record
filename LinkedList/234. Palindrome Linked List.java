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
    public boolean isPalindrome(ListNode head) {
        
        int length=size(head);
        
        int[] arr = new int[length];
        
        ListNode temp = head;
        
        for(int i=0;i<length;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        // int p=0;
        // while(head!=null)
        // {
        //   arr[p++]=head.val;
        // }
        
        for(int i=0;i<length/2;i++)
        {
            if(arr[i]!=arr[length-1-i])
                return false;
        }
        
        return true;
    }
    
    public int size(ListNode head)
    {
        int length=0;
        while(head!=null)
        {
            length++;
            head=head.next;
            
        }
        return length;
    }
    
}
