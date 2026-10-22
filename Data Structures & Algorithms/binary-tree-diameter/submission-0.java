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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        cal(root);
        return diameter;
    }
        public int cal(TreeNode node){
        
       if(node==null)
       {
            return 0;
       } 
        int left=cal(node.left);
        int right=cal(node.right);

       diameter=Math.max(diameter,left+right);
       return Math.max(left,right)+1;
        }
}
