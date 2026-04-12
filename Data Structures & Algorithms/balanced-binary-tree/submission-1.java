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
    int diff ;

    public boolean isBalanced(TreeNode root) {
        int val = dfs(root);
        if(val < 0) return false;
        else return true;
        
    }

    public int dfs(TreeNode node){

        int left, right;

        if(node == null) return 0;

         left = dfs(node.left);
         right = dfs(node.right);

        diff = Math.abs(left - right);
        if(diff >1) return -1;

        if(left == -1 || right == -1) return -1;

        return Math.max(left, right) +1;

    }
}
