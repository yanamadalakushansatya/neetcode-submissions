class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        boolean vis[]=new boolean [nums.length];
        check(nums,ls,ans,0,vis);
        return ans;
            }
            public void check(int nums[],List<Integer>ls,List<List<Integer>>ans,int index,boolean[]vis)
            {
                if(ls.size()==nums.length)
                {
                    ans.add(new ArrayList<>(ls));
                    return;
                }
                for(int i=0;i<nums.length;i++)
                {
                    if(vis[i])
                    {
                        continue;
                    }
                    vis[i]=true;
                    ls.add(nums[i]);
                    check(nums,ls,ans,i,vis);
                    ls.remove(ls.size()-1);
                    vis[i]=false;
                }
            }
}
