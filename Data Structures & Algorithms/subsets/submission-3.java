class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        check(nums,ls,ans,0);
        return ans;
    }
        public void check(int [] arr,List<Integer>ls,List<List<Integer>>ans,int i)
        {
            if(i==arr.length)
            {
                ans.add(new ArrayList(ls));
                return;
            }
            // for(int i=index;i<arr.length;i++)
            // {
            ls.add(arr[i]);
            check(arr,ls,ans,i+1);
            ls.remove(ls.size()-1);
            check(arr,ls,ans,i+1);
        // }
        }
}

