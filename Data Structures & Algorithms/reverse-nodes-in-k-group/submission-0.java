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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null) return null;

        ListNode temp = head;      
        int count = 0;

        while(count < k && temp!= null){
            temp = temp.next;
            count++;

            
        } 
       if(count < k)return head;

        ListNode newGroupHead = temp;      
        
     
        ListNode curr = head;
        ListNode prev = null;
        ListNode tail = head;
        ListNode help = head;

        int val = k;

        while(k >0){

            help = help.next;
            curr.next = prev;
            prev = curr;
            curr = help;

            k--;
        }

        tail.next = reverseKGroup(newGroupHead,val);

        return prev;
      
    }
}
