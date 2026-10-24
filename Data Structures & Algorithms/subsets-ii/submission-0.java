class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        check(ls,ans,0,nums);
        return ans;
    }
    public void check(List<Integer>ls,List<List<Integer>>ans,int index,int nums[])
  {
     ans.add(new ArrayList<>(ls));

     for(int i = index;i<nums.length;i++)
     {
        if(i>index && nums[i]==nums[i-1])
        {
            continue;
        }
        ls.add(nums[i]);
        check(ls,ans,i+1,nums);
        ls.remove(ls.size()-1);
     }
  }
}
