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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeLeft = dummy;
        ListNode curr = dummy;
        

        int count = 0; 
        while(count <right){

            if(count == left -1){
                 beforeLeft = curr;
            }
            curr = curr.next;
            count++;
        }
        ListNode leftNode = beforeLeft.next;
        ListNode rightNode = curr;
        ListNode afterRight = rightNode.next;

        ListNode temp = leftNode;
        ListNode prev = null;
        ListNode tail = leftNode;

        while(temp != afterRight){

            temp = leftNode.next;
            leftNode.next = prev;
            prev = leftNode;
            leftNode = temp;
        }


        beforeLeft.next = prev;
        tail.next = afterRight;


        return dummy.next;
        
    }
}