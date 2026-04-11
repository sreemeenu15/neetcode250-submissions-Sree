/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        return bfs(root);
    }

    public List<List<Integer>> bfs(TreeNode node){

       List<List<Integer>> result = new ArrayList<>();
      
        if(node == null) return new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();

        q.add(node);
        int length;
        
        while(!q.isEmpty()){

            length = q.size();
            List<Integer> elementsPerLevel = new ArrayList<>();


            for(int i =0; i< length; i++){

               TreeNode curr = q.poll();
               elementsPerLevel.add(curr.val);
             
               if(curr.left != null) q.add(curr.left);
               if(curr.right != null) q.add(curr.right);

            }
            result.add(elementsPerLevel);    

        }
      
      return result; 
    }
}
