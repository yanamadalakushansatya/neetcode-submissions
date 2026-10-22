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
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode vala =q.poll();
                level.add(vala.val);
            if(vala.left!=null)
            {
                q.offer(vala.left);
            }
            if(vala.right!=null)
            {
                q.offer(vala.right);
            }
            }
            ans.add(new ArrayList(level));
        }
        return ans;
    }
}
