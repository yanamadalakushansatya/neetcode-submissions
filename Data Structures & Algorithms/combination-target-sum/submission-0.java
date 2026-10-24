class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer>ls=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
                    check(nums,target,0,ls,ans);
                    return ans;

    }
    public void check(int arr [],int target,int index,List<Integer>ls,List<List<Integer>>ans)
    {
          if(target==0)
        {
        ans.add(new ArrayList<>(ls));
        return;
        }
       
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                break;
            }
            ls.add(arr[i]);
            check(arr,target-arr[i],i,ls,ans);
            ls.remove(ls.size()-1);
        }
    }
}
