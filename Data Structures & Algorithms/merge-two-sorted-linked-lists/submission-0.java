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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

      ListNode dummy = new ListNode(0);
      ListNode tail = dummy;

      ListNode curr1 = list1;
      ListNode curr2 = list2;
     

      //I must traverse for smaller list,I can use size method to know.
      if(list1 == null) return list2;
      if(list2 == null) return list1;

      while(curr2 != null && curr1 != null){

        if(curr1.val >= curr2.val){
           
           tail.next = curr2;
           tail = curr2;
           curr2 = curr2.next;


        }else{

         tail.next = curr1;
         tail = curr1;
         curr1 = curr1.next;
        }
       
      } 

      if(curr1 != null && curr2 == null){
              tail.next = curr1;
      }
      if(curr1 == null && curr2 != null){
        tail.next = curr2;
      }


     return  dummy.next;
    }
}