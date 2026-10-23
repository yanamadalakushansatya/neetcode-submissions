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
    int result=-1;
    int cnt=0;
    public int kthSmallest(TreeNode node, int k) {
        in(node,k);
        return result;
        
    }
    public void in(TreeNode root,int k)
    {
        if(root==null || cnt>=k)
        {
            return;
        }
        in(root.left,k);
        cnt++;
        if(cnt==k)
        {
            result=root.val;
            return;
        }
        in(root.right,k);
    }
}
