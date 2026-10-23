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
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }

        public int dfs(TreeNode node,int prev)
        {
            int cnt=0;
            if(node==null)
            {
                return 0;
            }
            if(node.val>=prev)
            {
                cnt=1;
                prev=node.val;
            }
            cnt+=dfs(node.left,prev);
            cnt+=dfs(node.right,prev);
        return cnt;
        }
    }
