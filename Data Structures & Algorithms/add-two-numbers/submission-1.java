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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp1 = l1;
        ListNode temp2 = l2;
       
        int carry =0;
        int sum;

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(temp1 != null || temp2 != null){

           sum = (temp1 != null ? temp1.val : 0) + (temp2 != null ? temp2.val : 0) + carry;
           carry = sum/10;

           ListNode newNode = new ListNode(sum % 10);

           tail.next = newNode;
           tail= newNode;
            
           if(temp1 != null){
            temp1 = temp1.next;
           }

           if(temp2 != null){
            temp2 = temp2.next;
           }

        }

        if(carry ==0){

            return dummy.next ;

        }else{
            tail.next = new ListNode(carry);
        }


        return dummy.next;

    }
}
