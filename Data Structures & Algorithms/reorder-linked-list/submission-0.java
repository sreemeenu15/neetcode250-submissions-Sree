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

    public ListNode findMiddle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = curr;

        while(temp != null){

            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public void reorderList(ListNode head) {

        ListNode mid = findMiddle(head);
        ListNode secondHalf = mid.next;
        mid.next = null;
        ListNode reverseHead = reverse(secondHalf);
        
        ListNode curr1 = head;
        ListNode curr2 = reverseHead;
        ListNode temp1 = curr1;
        ListNode temp2 = curr2;
        // ListNode dummy = new ListNode(0);
        // ListNode tail = dummy;


        while(curr2 != null){

            temp1 = curr1.next;
            curr1.next = curr2;
            temp2 = curr2.next;
            curr2.next = temp1;
            curr1 = temp1;
            curr2 = temp2;
            
        }

    }
}
