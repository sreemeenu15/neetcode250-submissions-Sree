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

    int maxPathLength = 0;

    public int diameterOfBinaryTree(TreeNode root) {
       dfs(root);
       return maxPathLength;
    }

    public int dfs(TreeNode node){

      
        int left, right;

        if(node == null) return 0;

         left = dfs(node.left) ;
         right = dfs(node.right);

        maxPathLength = Math.max(left+right, maxPathLength);

       return Math.max(left, right) + 1;


    }
}
