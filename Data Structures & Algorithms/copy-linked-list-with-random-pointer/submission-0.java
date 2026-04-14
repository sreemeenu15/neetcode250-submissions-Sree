/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node temp = head;
        Map<Node, Node> map = new HashMap<>();

        while(temp!= null){
             
         map.put(temp, new Node(temp.val));
         temp = temp.next;
  
        }
        temp = head;

        while(temp!= null){

        Node newNode = map.get(temp);
        newNode.next = map.get(temp.next);
        newNode.random = map.get(temp.random);

        temp = temp.next;

        }
        //Alfred how would I return the head of new Copied list.
        //would I need to reset my temp to head.
       return map.get(head);
        }
    }

